package com.hdor.user.address.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class UserAddressEndPoints {
	
	static String USER_JOHN1_TOKEN="xyJ3pFi5yOLikEYMyiv8PGhwYix1kjEiuHIoDz4VlSY";

    // Common Request Specification — reused everywhere
	private static RequestSpecification baseRequest(){
		return given()
				.header("Authorization","Bearer "+USER_JOHN1_TOKEN)
				.header("Application","web")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON);
	}
	
	public static Response getUserPrimaryAddress() {
		
		return baseRequest()
				.queryParam("type", "delivery")
				.when()
				.get(UserAllAddressRoutes.PRIMARY_ADDRESS);
	}
	
	public static Response getAllDeliveryAddress() {
		HashMap<String, Object>payload_data=new HashMap<String, Object>();
		payload_data.put("type", "delivery");
		payload_data.put("lastIndex", 0);
		payload_data.put("countPerPage", 100);
		
		return baseRequest()
				.body(payload_data)
				.when()
				.post(UserAllAddressRoutes.ALL_DELIVERY_ADDRESS);
	}
	
	public static Response getAllBillingAddress() {
		HashMap<String, Object>payload_data=new HashMap<String, Object>();
		payload_data.put("type", "billing");
		payload_data.put("lastIndex", 0);
		payload_data.put("countPerPage", 100);
		
		return baseRequest()
				.body(payload_data)
				.when()
				.post(UserAllAddressRoutes.ALL_BILLING_ADDRESS);
	}
	
	public static Response saveAddress() {
		
		HashMap<String, Object>payload=getAddressPayload();
		
		return baseRequest()
				.body(payload)
				.when()
				.post(UserAllAddressRoutes.SAVE_ADDRESS);
		
	}
	public static Response updateAddress() {
		
		HashMap<String, Object>payload=getAddressPayload();
        
		payload.put("rowId", 487);
		payload.put("firstName", "Johnny");
		
		return baseRequest()
				.body(payload)
				.when()
				.post(UserAllAddressRoutes.UPDATE_ADDRESS);
	}
	
	public static Response markAddressPrimary() {
		
		HashMap<String, Object> payload_data=new HashMap<String, Object>();
		payload_data.put("rowId", 487);
		
		return baseRequest()
				.body(payload_data)
				.when()
				.post(UserAllAddressRoutes.MARK_PRIMARY_ADDRESS);
	}
	
	public static Response removeAddress() {
		
		HashMap<String, Object> payload_data=new HashMap<String, Object>();
		payload_data.put("rowId", 777);
		
		return baseRequest()
				.body(payload_data)
				.when()
				.post(UserAllAddressRoutes.REMOVE_ADDRESS);
	}
	
	private static HashMap<String, Object> getAddressPayload() {
		
		HashMap<String, Object> payload = new HashMap<String, Object>();
		payload.put("primary", true);
		payload.put("pincode", "110043");
		payload.put("country", "India");
		payload.put("state", "Delhi");
		payload.put("city", "New Delhi West");
		payload.put("address1", "H.no-19, D-1999, Sainik Enclave Part-3, Gali no-5");
		payload.put("address2", "Najafgarh");
		payload.put("landmark", "Near Chauhan General Store");
		payload.put("type", "delivery");
		payload.put("label", "home");
		payload.put("mobile", "9876543210");
		payload.put("mobileCode", "91");
		payload.put("countryId", 101);
		payload.put("stateId", 10);
		payload.put("cityId", 59985);
		payload.put("firstName", "Johnny");
		payload.put("lastName", "One");
		return payload;

	}

}
