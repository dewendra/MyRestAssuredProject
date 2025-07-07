package com.restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ParsingXMLResponseData {
	@Test(priority = 1)
	void testResponse() {

		given()

				.when().get("https://dummyjson.com/users")

				.then()
				.statusCode(200)
				.header("Content-Type", "application/json; charset=utf-8")
				.body("users[0].gender", equalTo("female")).log().all();

	}
}
