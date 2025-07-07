package com.restAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {
	
	//@Test(priority=1)
		void testHeaders() {
			
			given()
				
			.when()
				.get("https://www.google.com/")
			.then()
				.statusCode(200)
				.header("Content-Type", "text/html; charset=ISO-8859-1")
				.header("Content-Encoding", "gzip")
				.header("Server", "gws")
				.log().all();
		}
		@Test(priority=1)
		void captureTheInfoFromHeaders() {
			Response res=given()
		
		.when()
			.get("https://www.google.com/");
			
			//get single headers and value
			
			String headerValue=res.getHeader("Content-Type");
			System.out.println(headerValue);
			
			//get all headers info
			Headers allHeaders =res.getHeaders();
			for(Header header:allHeaders){
				String header_name =header.getName();
				String header_value =header.getValue();
				System.out.println(header_name+":"+header_value);
				//System.out.println("Header name: "+header_name);
				//System.out.println("Header value: "+header_value);
	}

}
}
