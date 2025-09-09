package com.hdor.charityApp.endpoints;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CharityEndPoint {
	
	static String john2_bearerToken = "f/pwK2mBXJcB8yBV9C0TRNNgDyAD4BkBXLx/AjQUUvg";
	public static Response activeRequest() {
		RestAssured.filters(
				new RequestLoggingFilter(),
				new ResponseLoggingFilter()
				);
		
		HashMap<String, Object> data = new HashMap<>();
		data.put("eventId", 156);
		

		
		Response res = given()
				.header("Authorization","Bearer "+john2_bearerToken)
				.header("Application","web")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(data)
				
				.when()
				.post(AllCharityRoutes.active_Request_url);
		
		return res;
		
	}

}
