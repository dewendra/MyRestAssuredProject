package com.rahulshetty.restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.core.IsEqual;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.config.LogConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AutomateGet {

	//@Test
	public void validate_get_status_code() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
		given()
		.baseUri("https://api.postman.com")
		.header("x-api-Key",api_key)
		
		.when()
		.get("/workspaces")
		
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.body("workspaces.name", hasItems("My Workspace","Personal Workspace","HDOR"),
			  "workspaces.type",hasItems("personal","personal","personal"),
			  "workspaces[0].name", equalTo("My Workspace"),
			  "workspaces[0].name",is(equalTo("My Workspace")),
			  "workspaces.size()",equalTo(3),
			  "workspaces.name",hasItem("My Workspace"))
		;
	}
	
	//@Test
	public void extract_response() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
		Response res=given()
		.baseUri("https://api.postman.com")
		.header("x-api-Key",api_key)
		
		.when()
		.get("/workspaces")
		
		.then()
		.assertThat().statusCode(200)
		.extract().response();
		System.out.println("Response :" +res.asString());
	}
	
	//@Test
	public void extract_single_value_from_response() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
		Response res=given()
		.baseUri("https://api.postman.com")
		.header("x-api-Key",api_key)
		
		.when()
		.get("/workspaces")
		
		.then()
		.assertThat().statusCode(200)
		.extract().response();
		JsonPath jsonPath=new JsonPath(res.asString());
		System.out.println("Workspaces name :" +jsonPath.getString("workspaces[0].name"));
		//System.out.println("Workspaces name :" +jsonPath.getString("workspaces[0].name"));
		//System.out.println("Workspaces name :" +res.path("workspaces[0].name"));
	}
	
	//@Test
	public void hamcrest_assert_on_extracted_response() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
		
		String name=given()
		.baseUri("https://api.postman.com")
		.header("x-api-Key",api_key)
		
		.when()
		.get("/workspaces")
		
		.then()
		.assertThat().statusCode(200)
		.extract().response().path("workspaces[0].name");//storing name in the response as a string from the response
		//assertThat(name,equalTo("My Workspace"));// hamcrest method
		Assert.assertEquals(name, "My Workspace"); //TestNG assertion method
	}
	//@Test
	public void request_response_logging() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
		given()
		.baseUri("https://api.postman.com")
		.header("x-api-Key",api_key)
		//.log().all()
		.log().headers()
		
		.when()
		.get("/workspaces")
		
		.then()
		//.log().all()
		.log().ifError()
		//.log().body()
		.assertThat().statusCode(200)
		;
	}
	
	//@Test
	public void log_only_if_validation_fails() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
		given()
		.baseUri("https://api.postman.com")
		.header("x-api-Key",api_key)
		.log().ifValidationFails()
		
		.when()
		.get("/workspaces")
		
		.then()
		.log().ifValidationFails()
		.assertThat().statusCode(201)
		;
	}
	@Test
	public void logs_blacklist_header() {
		String api_key="PMAK-689775b3cb982b000105dc8d-1eaee3edb9e53cd754434993ff27cdb4fa";
		Set<String> headers=new HashSet<String>();
		headers.add("x-api-Key");
		headers.add("Accept");
		given()
		.baseUri("https://api.postman.com")
		.header("x-api-Key",api_key)
		.config(config.logConfig(LogConfig.logConfig().blacklistHeaders(headers)))
		.log().all()
		
		.when()
		.get("/workspaces")
		
		.then()
		.log().all()
		.assertThat().statusCode(200)
		;
	}
	
	
	
	
	
	
	
	

}
