package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.service.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordAPITest {
	//String success_msg="If your email exists in our system, you will receive reset instructions.";
	
    @Test(description = "Verify if Forgot Password API is working......")
	public void forgotPasswordTest() {
		AuthService authService=new AuthService();
		Response response = authService.forgotPassword("dewendra1.singh@yahoo.com");
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.asPrettyString(), "If your email exists in our system, you will receive reset instructions.");
		
	}

}
