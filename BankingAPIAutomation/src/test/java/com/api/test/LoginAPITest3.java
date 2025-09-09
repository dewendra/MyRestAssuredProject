package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.service.AuthService;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListeners.class)
public class LoginAPITest3 {

	@Test(description = "Verify if Login API is working......")
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("dewendra", "#System4techwithjatin");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);//'as' method convert JSON object to java object POJO
		
		System.out.println(response.asPrettyString());
		System.out.println("Token : " + loginResponse.getToken());
		System.out.println("Username : " + loginResponse.getUsername());
		System.out.println("Email : " + loginResponse.getEmail());
		System.out.println("id : " + loginResponse.getId());
		System.out.println("Roles : " + loginResponse.getRoles());

		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getEmail(), "dewendra.singh@yahoo.com");
		Assert.assertEquals(loginResponse.getId(), 2621);

	}
	public void signupTest() {
		
	}

}
