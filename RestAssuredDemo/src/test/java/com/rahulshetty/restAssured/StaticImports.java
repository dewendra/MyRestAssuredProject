package com.rahulshetty.restAssured;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import org.testng.annotations.Test;


public class StaticImports {

	@Test
	public void simple_test_case() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
					given()
						.baseUri("https://api.postman.com")
						.header("x-api-Key",api_key)
					.when()
						.get("/workspaces")
					.then()
						.statusCode(200)
						.body("workspaces.name",hasItem("My Workspace"));
					
	}
}
