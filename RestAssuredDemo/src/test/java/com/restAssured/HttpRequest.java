package com.restAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

//It is by defult folloe BDD(Behaiver Driver Development) Style
//Gerkin keywords(given(), when(), then())
//given() content type, set cookies, add auth, add param, set header info and etc....
//when() request type like get , post, put, delete
//then()validate status code, extract response, extract header, extract cookies,and response body...
public class HttpRequest {
	
	int id;


	//@Test(priority=1)
	void ListUsers() {
		System.out.println("List the all Users");
		
		given()
			.header("x-api-key", "reqres-free-v1")
		.when()
		 	.get("https://reqres.in/api/users?page=2")
		
		.then()
		 	.statusCode(200)
		 	.body("page",equalTo(2))
		 	.log().all();
		
		
	}
	@Test(priority=2)
	void createUser() {
		
		System.out.println("Creating User");
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Dewendra");
        map.put("job", "Tester");
        
		
       id= given()
    		   .header("x-api-key", "reqres-free-v1")
    		   .contentType("application/json")
    		   .body(map)
		
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		  
		
			
		/*
		 * .then() .statusCode(201) // Typically 201 is returned for successful
		 * creation, not 200 .body("name", equalTo("Dewendra")) // Validate response
		 * body .body("job", equalTo("Tester")) .body("id", notNullValue()) // Ensure ID
		 * is generated .log().all() .extract().path("id"); // Alternative way to
		 * extract the ID
		 */			 
	}
	@Test(priority=3, dependsOnMethods =  {"createUser"})
	void updateUser() {
		
		System.out.println("Update the user");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "Dewendra");
		map.put("job", "SDET");
		
		given()
		 	.header("x-api-key", "reqres-free-v1")
		 	.contentType("application/json")
		 	.body(map)
		
         .when()
		 	.put("https://reqres.in/api/users/"+id)
		 
		
		 .then()
		  	.statusCode(200)
		  	.log().all();
	}
	
	
	@Test(priority=4, dependsOnMethods =  {"createUser"})
	void deleteUser() {
		System.out.println("Delete the user");
		
		given()
			.header("x-api-key", "reqres-free-v1")
		.when()
			.delete("https://reqres.in/api/users/"+id)
		
		.then()
			.statusCode(204)
			.log().all();
	}
}
