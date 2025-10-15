package com.phoenix;

import static io.restassured.RestAssured.*;

import com.google.gson.Gson;

import io.restassured.response.Response;

public class LoginAPITest {
	

	public static void main(String[] args) {
		
		//http://phoenix.techwithjatin.com/
		
		LoginPayload loginPayload=new LoginPayload("iamfd", "password");
		
		baseURI="http://64.227.160.186:9000/v1/";
		String base_PATH="login";
		
		LoginResponse loginResponse=given()
		.baseUri(baseURI)
		.header("Content-Type","application/json")
		.body(convertJavaObjectToJsonObject(loginPayload)) //serializing the Java object to the JSON object
		.when()
		.post(base_PATH)
		.as(LoginResponse.class);//Deserializing the JSON object to the Java object
		
		System.out.println(loginResponse);
		System.out.println("message : "+loginResponse.getMessage());
		System.out.println("token : "+loginResponse.getData().getToken());
				
		
	}
	public static String convertJavaObjectToJsonObject(Object src) {
		Gson gson=new Gson();
		String jsonData=gson.toJson(src);
		return jsonData;
	}
	
	

}
