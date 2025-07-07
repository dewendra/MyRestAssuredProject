package com.restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingJSONResponseData {

	// @Test(priority=1)
	void testResponse() {

		given()

				.when().get("https://dummyjson.com/users")

				.then().statusCode(200).header("Content-Type", "application/json; charset=utf-8")
				.body("users[0].gender", equalTo("female")).log().all();

	}

	@Test(priority = 1)
	void testJSONResponse() {

		// Approach 1
		Response res = given().contentType(ContentType.JSON).when().get("https://dummyjson.com/users");

		// Assert.assertEquals(res.getStatusCode(), 200);
		// Assert.assertEquals(res.getContentType(), "application/json; charset=utf-8");

		// String username=res.jsonPath().get("users[0].username").toString();
		// System.out.println(username);
		// Assert.assertEquals(username, "emilys");

		// JSONObject class
		JSONObject jsonObject = new JSONObject(res.asString());// converting response into JSON Object type
		boolean status = false;
		for (int i = 0; i < jsonObject.getJSONArray("users").length(); i++) {

			String emails = jsonObject.getJSONArray("users").getJSONObject(i).get("email").toString();
			System.out.println(emails);

			if (emails.equals("mateo.nguyen@x.dummyjson.com")) {
				status = true;
				break;
			}

		}
		Assert.assertEquals(status, true);

		// find and validate total weight of the users
		double total_Weight=0;
		for (int i = 0; i < jsonObject.getJSONArray("users").length(); i++) {

			String totalWeight = jsonObject.getJSONArray("users").getJSONObject(i).get("weight").toString();
			total_Weight=total_Weight+Double.parseDouble(totalWeight);

		}
		System.out.println("Total weight:"+total_Weight);
	}

}
