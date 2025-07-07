package com.restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

//Type of Authentication
//1) Basic Authentication
//2) Digest Authentication
//3) Preemptive Authentication
//4) Bearer Token
//5) OAuth 1.0, 2.0
//6) API Key




public class Authentication {
	
	
	//1) Basic Authentication
	//@Test(priority=1)
	void testBasicAuthentication() {
		
		given()
			.auth().basic("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		
			.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
		
		
	}
	
	//2) Digest Authentication
	//@Test(priority=2)
	void testDigestAuthentication() {
		
		given()
			.auth().digest("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		
			.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
		
		
	}
	
	//3) Preemptive Authentication
	//@Test(priority=3)
	void testPreemptiveAuthentication() {
		
		given()
			.auth().preemptive().basic("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		
			.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
		
		
	}
	
	//4) Bearer Token
		//@Test(priority=4)
		void testBearerTokenAuthentication() {
			String bearerToken="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";
			
			given()
				.headers("Authorization","Bearer "+bearerToken)
			
			.when()
				.get("https://api.github.com/user/repos")
			
				.then()
			.statusCode(200)
			//.body("authenticated", equalTo(true))
			.log().all();
			
			
		}
		
	//5) OAuth 1.0
		//@Test(priority=4)
		void testOauth1Authentication() {
			
			
			given()
				.auth().oauth("consumer key","consumer secrete","access token","token secrete")//pass these parameters consumer key, consumer secrete, access token, token secrete
			
			.when()
				.get("https://api.github.com/user/repos")
			
				.then()
			.statusCode(200)
			//.body("authenticated", equalTo(true))
			.log().all();
			
			
		}
		
		//5) OAuth 2.0
				//@Test(priority=4)
				void testOauth2Authentication() {
					
					
					given()
						.auth().oauth2("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")//pass only access token
					
					.when()
						.get("https://api.github.com/user/repos")
					
						.then()
					.statusCode(200)
					//.body("authenticated", equalTo(true))
					.log().all();
					
					
				}
				
				
			//6) API Key
				@Test(priority=4)
				void testApiKeyAuthentication() {
					
					
					given()
					.header("x-api-key", "reqres-free-v1")//pass api key and value
					
					.when()
					.get("https://reqres.in/api/users?page=2")
					
						.then()
					.statusCode(200)
					//.body("authenticated", equalTo(true))
					.log().all();
					
					System.out.println("Hi Test");
				}		

}
