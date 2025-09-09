package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.filters.LogginFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Base URI
//Creating the Request
//Handling the response
public class BaseService { // Wrapper for Rest Assured

	
	// http://64.227.160.186:8080/swagger-ui/index.html#/
	private static final String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;

	//For loggin all thing
	static {
		RestAssured.filters(new LogginFilter());
	}

	public BaseService() {
		requestSpecification = given().baseUri(BASE_URL);
	}

	// Set user Token in the header
	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization", "Bearer " + token);
	}

	// GET Request
	protected Response getRequest(String endPoint) {
		return requestSpecification.get(endPoint);
	}

	// POST Request
	protected Response postRequest(Object payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
	}

	// PUT Request
	protected Response putRequest(Object payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endPoint);
	}

	// PATCH Request
	protected Response patchRequest(Object payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endPoint);
	}

	// DELETE Request
	protected Response deleteRequest(String endPoint) {
		return requestSpecification.get(endPoint);
	}

}