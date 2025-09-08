package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileUpdateRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import com.api.service.AuthService;
import com.api.service.UserProfileManagementService;

import io.restassured.response.Response;

public class ProfileUpdateAPITest {

	@Test(description = "Verify if Login API is working......")
	public void profileUpdateTest() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("dewendra", "#System4techwithjatin"));
		LoginResponse login_Response = response.as(LoginResponse.class);

		System.out.println("Login Response : "+response.asPrettyString());

		System.out.println("-----------------------------------------------------------------------");
		
		UserProfileManagementService user_Profile_Management_Service = new UserProfileManagementService();
		Response profile_response = user_Profile_Management_Service.getProfile(login_Response.getToken());
		System.out.println("Profile Response : "+profile_response.asPrettyString());
		
		UserProfileResponse user_profile_response = profile_response.as(UserProfileResponse.class);
		Assert.assertEquals(user_profile_response.getUsername(), "dewendra");
		

		ProfileUpdateRequest profile_Update_Request = new ProfileUpdateRequest.Builder()
				.email("dewendra.singh@yahoo.com")
				.firstName("devendra")
				.lastName("kumar")
				.mobileNumber("9876543211")
				.build();

		Response update_Profile_response = user_Profile_Management_Service.updateProfile(profile_Update_Request,
				login_Response.getToken());
		
		System.out.println("----------------------------------After update-------------------------------------");
		System.out.println("Updated Profile Response : "+update_Profile_response.asPrettyString());

	}
	
	

}
