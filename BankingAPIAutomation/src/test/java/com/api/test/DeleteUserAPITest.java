package com.api.test;

import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.service.AuthService;
import com.api.service.UserProfileManagementService;

import io.restassured.response.Response;

public class DeleteUserAPITest {

	@Test(description = "Verify if Delete API is working......")
	public void deleteUser() {
		AuthService authService=new AuthService();
		Response response = authService.login(new LoginRequest("dewendra", "#System4techwithjatin"));
		LoginResponse login_Response = response.as(LoginResponse.class);

		System.out.println("Login Response : "+response.asPrettyString());

		System.out.println("-----------------------------------------------------------------------");
		
		UserProfileManagementService userProfileManagementService=new UserProfileManagementService();
		userProfileManagementService.deleteUser(null);
		
		
		
	}
}
