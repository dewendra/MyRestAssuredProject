package com.restAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PathAndQueryParameters {
	@Test
	void testQueryAndPathParameters() {
		
		// https://reqres.in/api/users?page=2&id=5
		
		given()
			.header("x-api-key", "reqres-free-v1")
			.pathParam("mainPath", "users")  //path parameters
			.queryParam("page", 2) //query parameters
			.queryParam("id", 5) //query parameters
		
		.when()
			.get("https://reqres.in/api/{mainPath}")
		
		.then()
			.statusCode(200)
			.log().all();
		
	}

}
