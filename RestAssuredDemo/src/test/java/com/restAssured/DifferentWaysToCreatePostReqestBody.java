package com.restAssured;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

/*
 Different ways to create POSt request body
 1) By using HashMap
 2) By using orj.json
 3) By using POJO Class
 4) By using external json file data
 */

public class DifferentWaysToCreatePostReqestBody {
	int id;
	
	//Method 1 By using HashMap
	//@Test(priority=1)
	void postRequestBodyUsingHashMap() {
		System.out.println("Creating User");
		HashMap<String, String> data=new HashMap<>();
		data.put("name", "Manish Singh Rawat");
		data.put("job", "Developer");
		id=given()
			.header("x-api-key", "reqres-free-v1")
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.body("name", equalTo("Manish Singh Rawat"))
			.body("job", equalTo("Developer"))
			.body("id",notNullValue())
			.header("Content-Type", "application/json; charset=utf-8")
			.log().all()
			.extract().path("id");
		
	}
	
	//Method 2 By using org.json library
		@Test(priority=1)
		void postRequestBodyUsingOrgJsonLibrary() {
			
			JSONObject json_data=new JSONObject();
			json_data.put("name", "Shyam One");
			json_data.put("job", "UI Designer");
			
			given()
				.header("x-api-key", "reqres-free-v1")
				.contentType("application/json")
				.body(json_data.toString())
			.when()
				.post("https://reqres.in/api/users")
			.then()
				.statusCode(201)
				.body("name", equalTo("Shyam One"))
				.body("job", equalTo("UI Designer"))
				.body("id",notNullValue())
				.header("Content-Type", "application/json; charset=utf-8")
				.log().all()
				.extract().path("id");
				
		}
		
		//Method 3 By using POJO class
				//@Test(priority=1)
				void postRequestBodyUsingPOJO() {
					
					Pojo_PostRequest pojo_data=new Pojo_PostRequest();
					
					pojo_data.setName("Shyam Two");
					pojo_data.setJob("Automation Tester");
					
					given()
						.header("x-api-key", "reqres-free-v1")
						.contentType("application/json")
						.body(pojo_data)
					.when()
						.post("https://reqres.in/api/users")
					.then()
						.statusCode(201)
						.body("name", equalTo("Shyam Two"))
						.body("job", equalTo("Automation Tester"))
						.body("id",notNullValue())
						.header("Content-Type", "application/json; charset=utf-8")
						.log().all()
						.extract().path("id");
						
				}
				//Method 3 By using External Json File
				//@Test(priority=1)
				void postRequestBodyUsingExternalJsonFile() throws FileNotFoundException {
					System.out.println("Create the user");
					
					File file=new File(".\\body.json");
					FileReader fileReader=new FileReader(file);
					JSONTokener jsonTokener=new JSONTokener(fileReader);
					JSONObject data=new JSONObject(jsonTokener);
					
					
					
					given()
						.header("x-api-key", "reqres-free-v1")
						.contentType("application/json")
						.body(data.toString())
					.when()
						.post("https://reqres.in/api/users")
					.then()
						.statusCode(201)
						.body("name", equalTo("Shyam One"))
						.body("job", equalTo("Developer"))
						.body("id",notNullValue())
						.header("Content-Type", "application/json; charset=utf-8")
						.log().all()
						.extract().path("id");
						
				}
				
				
				
				
				
				
				
				
	  @Test(priority=2) 
	  void deleteuser() { 
		  System.out.println("Delete the user");
		  
		  given()
		  	.header("x-api-key", "reqres-free-v1")
	  
		  .when() 
	  		.delete("https://reqres.in/api/users/"+id) 
	  	  .then()
	  	  	.statusCode(204)
	        .log().all(); }
	  
	

}
