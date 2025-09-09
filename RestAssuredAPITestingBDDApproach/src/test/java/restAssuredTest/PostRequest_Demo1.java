package restAssuredTest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import restAssuredTest.util.RestUtils;

public class PostRequest_Demo1 {
	
	String bearerToken="dadc9149e2176d6e9542d4e4f25ee3302cb5efd47858e4c0dd195966166faef0";

	
	public static HashMap map=new HashMap();
	
	
	@BeforeClass
	public void postData() {
		map.put("FirstName", RestUtils.getFirstName());
		//map.put("LastName", RestUtils.getLastName());
		//map.put("UserName", RestUtils.getUserName());
		//map.put("password", RestUtils.getPassword());
		map.put("Email", RestUtils.getEmail());
		map.put("gender", "male");
		map.put("status	", "inactive");
		
		//RestAssured.baseURI="https://gorest.co.in/public/v2/users";
		//RestAssured.basePath="users";
		
	}
	
	
	
	@Test
	public void testpostData() {
		
		given()
			.headers("Authorization","Bearer "+bearerToken)
			.contentType("application/json")
			.body(map)
		
		.when()
			.post("https://gorest.co.in/public/v2/users")
		.then()
			//.statusCode(201)
			.log().all();
		
		
		
	}

}
