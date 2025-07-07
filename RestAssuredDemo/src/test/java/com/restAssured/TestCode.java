package com.restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCode {

	@Test(priority = 1)
	void testJSONResponse() {

		Response res = given().contentType("application/json") // Correct content type
				.when().get("https://dummyjson.com/users");

		// First verify the status code
		Assert.assertEquals(res.getStatusCode(), 200);

		// Get the response body as string and then convert to JSONObject
		JSONObject jsonObject = new JSONObject(res.asString());

		// Print all emails from the users array
		for (int i = 0; i < jsonObject.getJSONArray("users").length(); i++) {
			String email = jsonObject.getJSONArray("users").getJSONObject(i).getString("email");
			System.out.println(email);
		}
	}

}
