package com.hdor.charityApp.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.sl.usermodel.ObjectMetaData.Application;

import com.hdor.charityApp.payloads.Ngo;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CharityEndPoints {
	static String john2_bearerToken = "f/pwK2mBXJcB8yBV9C0TRNNgDyAD4BkBXLx/AjQUUvg";
	static int eventId = 156;

	public static Response categoryList() {
		RestAssured.filters(
				new RequestLoggingFilter(),
				new ResponseLoggingFilter()
				);
		
		HashMap<String, Object> data = new HashMap<>();
		data.put("id", eventId);
		

		RequestSpecification request= createQueryParamRequest(given(), john2_bearerToken, "web", data);

		Response res = request
				.when()
				.get(AllCharityRoutes.category_url);

		return res;
	}
	
	public static Response activeRequest() {
		RestAssured.filters(
				new RequestLoggingFilter(),
				new ResponseLoggingFilter()
				);
		
		HashMap<String, Object> data = new HashMap<>();
		//data.put("id", eventId);
		data.put("eventId", 156);
		

		RequestSpecification request= createQueryParamRequest(given(), john2_bearerToken, "web", data);
		Response res = request
				.when()
				.post(AllCharityRoutes.active_Request_url);
		
		return res;
		
	}
	
	
	
	
	public static RequestSpecification createQueryParamRequest(RequestSpecification specs, String token, String type, HashMap<String, Object> map) {
		
		RequestSpecification request = createAuthenitcationRequest(specs, token, type);
		
		for(Entry<String, Object> key : map.entrySet()) {
			request = request.queryParam(key.getKey(), key.getValue());
		}
		
		return request;
		
	}

	public static RequestSpecification createAuthenitcationRequest(RequestSpecification specs, String token, String type) {
		return specs
				.header("Authorization", "Bearer " + token)
				.header("Application",type)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON);
		
	}
}
