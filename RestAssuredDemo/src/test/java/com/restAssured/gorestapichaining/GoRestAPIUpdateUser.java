package com.restAssured.gorestapichaining;



import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GoRestAPIUpdateUser {
	
	@Test
	void updateUser(ITestContext context) {
		//int id = (int) context.getAttribute("user_id");//this should come from createUser request
		int id = (int) context.getSuite().getAttribute("user_id");//getting id from suite label
		String bearerToken="dadc9149e2176d6e9542d4e4f25ee3302cb5efd47858e4c0dd195966166faef0";
		
		//generate fake data for testing purposes
		Faker faker=new Faker();
		JSONObject data=new JSONObject();
		data.put("name",faker.name().fullName());
		data.put("gender", "Female");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "active");
		
		given()
			.headers("Authorization","Bearer "+bearerToken)
			.contentType("application/json")
			.body(data.toString())
			.pathParam("id", id)  //path parameters
		
		.when()
			.put("https://gorest.co.in/public/v2/users/{id}")
			
		.then()
			.statusCode(200)
			.log().all();
		
		//System.out.println("Id : "+id);
		
		
	}

}
