package com.api.test;

import org.testng.annotations.Test;

import com.api.models.request.ResetPasswordRequest;
import com.api.service.AuthService;

import io.restassured.response.Response;

public class ResetPasswordAPITest {

	@Test(description = "Verify if Reset password API is working......")
	public void resetPasswordTest() {
		ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest("bbed3404-5bcb-4970-84f8-26a40c3f583a",
				"password", "password");
		AuthService authService = new AuthService();
		Response response = authService.resetPassword(resetPasswordRequest);
		
		System.out.println(response.asPrettyString());

	}

}
