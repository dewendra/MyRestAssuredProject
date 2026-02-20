package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import java.util.Map;

//Base URI
//Creating the Request
//Handling the response
public class BaseSerivce {

    private static final String BASE_URL = "https://apitest.procam.in";
    private String authToken;   // Only store token, NOT request

    // Set Bearer Token
    protected void setAuthToken(String token) {
        this.authToken = token;
    }

    // Common request builder
    private io.restassured.specification.RequestSpecification getRequestSpec() {
        if (authToken != null) {
            return given()
                    .baseUri(BASE_URL)
                    .header("Authorization", "Bearer " + authToken);
        } else {
            return given()
                    .baseUri(BASE_URL);
        }
    }

    // GET
    protected Response getRequest(String endPoint) {
        return getRequestSpec().get(endPoint);
    }

    // GET with Query Params
    protected Response getQueryRequest(String endPoint, Map<String, Object> queryParams) {
        return getRequestSpec()
                .queryParams(queryParams)
                .get(endPoint);
    }
    
 // GET with Query Params
    protected Response getFormRequest(String endPoint, Map<String, String> formParams) {
        return getRequestSpec()
        		.contentType(ContentType.URLENC)
                .queryParams(formParams)
                .get(endPoint);
    }
    
 // GET with payload
    protected Response getPayloadRequest(String endPoint, Object payload) {
        return getRequestSpec()
        		.contentType(ContentType.JSON)
        		.body(payload)
                .get(endPoint);
    }
    
    
    // POST JSON
    protected Response postRequest(Object payload, String endPoint) {
        return getRequestSpec()
                .contentType(ContentType.JSON)
                .body(payload)
                .post(endPoint);
    }

    // POST FORM
    protected Response postFormRequest(String endPoint, Map<String, String> formParams) {
        return getRequestSpec()
                .contentType(ContentType.URLENC)
                .formParams(formParams)
                .post(endPoint);
    }

    // PUT
    protected Response putRequest(Object payload, String endPoint) {
        return getRequestSpec()
                .contentType(ContentType.JSON)
                .body(payload)
                .put(endPoint);
    }

    // PATCH
    protected Response patchRequest(Object payload, String endPoint) {
        return getRequestSpec()
                .contentType(ContentType.JSON)
                .body(payload)
                .patch(endPoint);
    }

    // DELETE
    protected Response deleteRequest(String endPoint) {
        return getRequestSpec().delete(endPoint);
    }}
