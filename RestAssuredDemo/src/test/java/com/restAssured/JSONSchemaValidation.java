package com.restAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JSONSchemaValidation {
	
	@Test
	void jsonSchemaValidation() {
		
		given()
		
		.when()
			.get("https://dummyjson.com/users")
		.then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("userJsonSchema.json"));//schema validation
		//.log().all();
	}

}
