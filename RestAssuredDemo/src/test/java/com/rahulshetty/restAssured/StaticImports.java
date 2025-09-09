package com.rahulshetty.restAssured;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import org.testng.annotations.Test;


public class StaticImports {

	@Test
	public void simple_test_case() {
		
					given()
						.baseUri("https://api.postman.com")
						//.header("x-api-Key",api_key)
					.when() 
						.get("/workspaces")
					.then()
						.statusCode(200)
						.body("workspaces.name",hasItem("My Workspace"));
				 	
	}
}
