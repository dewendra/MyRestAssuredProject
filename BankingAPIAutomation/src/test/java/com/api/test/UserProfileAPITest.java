package com.api.test;

import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import com.api.service.AuthService;
import com.api.service.UserProfileManagementService;

import io.restassured.response.Response;

public class UserProfileAPITest {

	@Test(description = "Verify if Get User Profile API is working......")
	public void getUserProfile() {
		
		AuthService authService=new AuthService();
		Response response = authService.login(new LoginRequest("dewendra", "#System4techwithjatin"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		String token=loginResponse.getToken();
		System.out.println("Token : "+token);
		
		UserProfileManagementService userProfileManagementService=new UserProfileManagementService();
		Response profile_response = userProfileManagementService.getProfile(token);
		System.out.println(profile_response.asPrettyString());
		UserProfileResponse userProfileResponse = profile_response.as(UserProfileResponse.class);
		System.out.println("Username : "+userProfileResponse.getUsername());
	
		
	}

}
