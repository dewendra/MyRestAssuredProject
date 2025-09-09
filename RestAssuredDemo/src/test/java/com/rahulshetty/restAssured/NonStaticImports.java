package com.rahulshetty.restAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class NonStaticImports {
	@Test
	public void simple_test_case() {
		
		RestAssured.given()
						.baseUri("https://api.postman.com")
						//.header("x-api-Key",api_key)
					.when()
						.get("/workspaces")
					.then()
						.statusCode(200)
						.body("name",Matchers.is(Matchers.equalTo("dewendra")),
								"email",Matchers.is(Matchers.equalTo("dewendra.singh@yahoo.com")));
	}
 
}
