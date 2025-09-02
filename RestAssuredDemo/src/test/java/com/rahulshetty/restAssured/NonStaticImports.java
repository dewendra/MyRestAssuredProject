package com.rahulshetty.restAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class NonStaticImports {
	@Test
	public void simple_test_case() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fb";
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
