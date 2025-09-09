package com.api.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.models.request.SignUpRequest;
import com.api.service.AuthService;
import io.restassured.response.Response;

public class SignupAPITest {


	@Test(description = "Verify if Signup API is working......")
	public void signupTest() {
		AuthService authService = new AuthService();
		//Method one by using constructor
		/*
		 * SignUpRequest signUpRequest = new SignUpRequest("alok1", "password",
		 * "dewendra1.singh@yahoo.com", "Alok1", "Singh", "9876543210");
		 */
		
		//You can also use the builder Method which is inner class of a class to setAlt_return the data
		SignUpRequest signUpRequest=new SignUpRequest.Builder()
		.username("alok2")
		.mobileNumber("9876543210")
		.password("password")
		.firstName("Alok2")
		.email("dewendra2.singh@yahoo.com")
		.lastName("Singh")
		.build();
		
		
		Response response = authService.signup(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");

	}

}
