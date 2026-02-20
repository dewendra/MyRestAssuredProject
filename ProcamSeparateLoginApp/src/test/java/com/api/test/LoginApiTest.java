package com.api.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.api.models.request.AddressDetailsRequest;
import com.api.models.request.ClientTokenRequest;
import com.api.models.request.EventPropertiesRequest;
import com.api.models.request.EventTicketDetailsRequest;
import com.api.models.request.GetCartDetailsRequest;
import com.api.models.request.GetPersonalDetailsRequest;
import com.api.models.request.LoginRequest;
import com.api.models.request.QuestionsDetailsRequest;
import com.api.models.request.SetPersonalDetailsRequest;
import com.api.models.request.UserOtpRequest;
import com.api.models.response.ClientTokenResponse;
import com.api.models.response.EventPropertiesResponse;
import com.api.models.response.EventTicketDetailsResponse;
import com.api.models.response.GetCartDetailsResponse;
import com.api.models.response.GetPersonalDetailsResponse;
import com.api.models.response.LoginResponse;
import com.api.models.response.SetPersonalDetailsResponse;
import com.api.models.response.UserOtpResponse;
import com.api.service.AuthService;

import io.restassured.response.Response;

public class LoginApiTest {
	AuthService authService = new AuthService();
	String accessToken;
	String verifier;
	String userToken;

	@Test(description = "Verify client API is working......")
	public void clientToken() {
		ClientTokenRequest clientTokenRequest = new ClientTokenRequest("gss-procam-5239048");
		Response response = authService.clientToken(clientTokenRequest);
		ClientTokenResponse clientTokenResponse = response.as(ClientTokenResponse.class);
		System.out.println("Response:-> "+response.asPrettyString());
		System.out.println("AccessToken : " + clientTokenResponse.getAccessToken());
		accessToken = clientTokenResponse.getAccessToken();
	}

	@Test(dependsOnMethods = "clientToken")
	public void clientOtp() {
		authService.setBearerToken(accessToken);
		UserOtpRequest otpRequest = new UserOtpRequest("amar1@yopmail.com", 23,
				"I am above 18 years of age registering for myself");
		Response response = authService.UserOtp(otpRequest);
		UserOtpResponse userOtpResponse = response.as(UserOtpResponse.class);
		System.out.println("Response:-> "+response.asPrettyString());
		verifier = userOtpResponse.getCode();
		System.out.println("User code : " + userOtpResponse.getCode());
		userOtpResponse.setCode(verifier);
	}

	@Test(dependsOnMethods = "clientOtp")
	public void login() {
		authService.setBearerToken(accessToken);
		LoginRequest loginRequest = new LoginRequest("0", verifier);
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);// 'as' method convert JSON object to java object
																		// POJO
		System.out.println("Response:-> "+response.asPrettyString());
		userToken = loginResponse.getAccessToken();
	}
	
	@Test(dependsOnMethods = "login")
	public void getEventProperties() {
		authService.setBearerToken(userToken);
		EventPropertiesRequest eventPropertiesRequest=new EventPropertiesRequest("23");
		Response response=authService.getEventProperties(eventPropertiesRequest);
		EventPropertiesResponse eventPropertiesResponse=response.as(EventPropertiesResponse.class);
		System.out.println("Response:-> "+response.asPrettyString());
		
	}
	
	@Test(dependsOnMethods = "login")
	public void getPersonalDetails() {
		authService.setBearerToken(userToken);
		GetPersonalDetailsRequest getPersonalDetailsRequest = new GetPersonalDetailsRequest("23", null);
		Response response = authService.getPersonalDetails(getPersonalDetailsRequest);
		GetPersonalDetailsResponse getPersonalDetailsResponse=response.as(GetPersonalDetailsResponse.class);
		System.out.println("Response:-> "+ response.asPrettyString());
	}
	
	@Test(dependsOnMethods = "getPersonalDetails")
	public void setPersonalDetails() {
		
		// 1️) Set Bearer Token
		authService.setBearerToken(userToken);
		
		// 2️) Create Questions List HERE 👇
	    List<QuestionsDetailsRequest> questions = new ArrayList<>();

	    questions.add(new QuestionsDetailsRequest("country", "101"));
	    questions.add(new QuestionsDetailsRequest("city", "14853"));
	    questions.add(new QuestionsDetailsRequest("state", "8567"));
	    questions.add(new QuestionsDetailsRequest("pincode", "110019"));
	    questions.add(new QuestionsDetailsRequest("runningGroup", 0));
	    questions.add(new QuestionsDetailsRequest("corporate", "Other"));
	    questions.add(new QuestionsDetailsRequest("occupation", "Student"));
	    
	    // 3️) Create Address Object
	    AddressDetailsRequest address = new AddressDetailsRequest(
	            "Amar One",
	            "amar1@yopmail.com",
	            "91-9876543210",
	            "121, Ansal Tower-38, Nehru Place",
	            "",
	            "",
	            "India",
	            "Delhi",
	            "New Delhi",
	            "110019",
	            ""
	    );
		SetPersonalDetailsRequest setPersonalDetailsRequest = new SetPersonalDetailsRequest(questions, 23, null, 0,
				"Amar", "One", "amar1@yopmail.com", "male", "91-9876543210", 97, false, "Indian", "2010-04-05",
				address);
		Response response=authService.setPersonalDetails(setPersonalDetailsRequest);
		System.out.println(response.asPrettyString());
		SetPersonalDetailsResponse setPersonalDetailsResponse=response.as(SetPersonalDetailsResponse.class);
		}

	@Test(dependsOnMethods = "setPersonalDetails")
	public void getCartDetails() {
		authService.setBearerToken(userToken);
		GetCartDetailsRequest getCartDetailsRequest=new GetCartDetailsRequest("23");
		Response response=authService.getCartDetails(getCartDetailsRequest);
		GetCartDetailsResponse getCartDetailsResponse=response.as(GetCartDetailsResponse.class);
		System.out.println("Response:-> "+response.asPrettyString());
		System.out.println("Billing Amount: "+getCartDetailsResponse.getCartData().getBillingAmount());
	}
	
	@Test(dependsOnMethods = "setPersonalDetails")
	public void getEcventTicketDetails() {
		authService.setBearerToken(userToken);
		EventTicketDetailsRequest eventTicketDetailsRequest=new EventTicketDetailsRequest("23", "on_ground", "MAILTESTCODE1");
		Response response=authService.getEventTicketDetails(eventTicketDetailsRequest);
		EventTicketDetailsResponse eventTicketDetailsResponse=response.as(EventTicketDetailsResponse.class);
		System.out.println("Response:-> "+response.asPrettyString());
		
		  System.out.println("First Category Name: " +
		  eventTicketDetailsResponse.getData().get(0).getRaceCategoryName());
		  
		  System.out.println("First Ticket Name: " +
		  eventTicketDetailsResponse.getData().get(0) .getTicketList().get(0)
		  .getName());
		  
		  System.out.println("Ticket Price: " +
		  eventTicketDetailsResponse.getData().get(0) .getTicketList().get(0)
		  .getPricing().get(0) .getAmount());
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
