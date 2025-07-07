package com.restAssured.gorestapichaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;



public class GoRestAPIGetUser {
	

	@Test
	void getUser(ITestContext context) {

		//int id = (int) context.getAttribute("user_id");//this should come from createUser request
		int id = (int) context.getSuite().getAttribute("user_id");//getting id from suite label
		String bearerToken = "dadc9149e2176d6e9542d4e4f25ee3302cb5efd47858e4c0dd195966166faef0";

		
			given()
				.headers("Authorization", "Bearer " + bearerToken)
				.contentType("application/json")
				.pathParam("id", id)  //path parameters
				

			.when()
				.get("https://gorest.co.in/public/v2/users/{id}")
				
			.then()
				.statusCode(200)
				.log().all();

	

	}

}
