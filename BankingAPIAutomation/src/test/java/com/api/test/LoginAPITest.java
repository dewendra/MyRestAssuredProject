package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {
	

	@Test(description = "Verify if Login API is working......")
	public void loginTest() {
		RestAssured.baseURI="http://64.227.160.186:8080";
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-type","application/json");
		RequestSpecification body = header.body("{\"username\": \"dewendra\", \"password\": \"#System4techwithjatin\"}");
		Response response = body.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
