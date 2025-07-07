package com.restAssured.gorestapichaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


public class GoRestAPICreateUser {
	
	@Test
	void createUser(ITestContext context) {
		
		String bearerToken="dadc9149e2176d6e9542d4e4f25ee3302cb5efd47858e4c0dd195966166faef0";
		
		Faker faker=new Faker();
		JSONObject data=new JSONObject();
		data.put("name",faker.name().fullName());
		data.put("gender", "Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "inactive");
		
		int id=given()
			.headers("Authorization","Bearer "+bearerToken)
			.contentType("application/json")
			.body(data.toString())
		
		.when()
			.post("https://gorest.co.in/public/v2/users")
			.jsonPath().getInt("id");
		
		System.out.println("Id : "+id);
		
		//context.setAttribute("user_id", id);//setting the id in context for another class
		context.getSuite().setAttribute("user_id", id);//for suit label
		
	}

}
