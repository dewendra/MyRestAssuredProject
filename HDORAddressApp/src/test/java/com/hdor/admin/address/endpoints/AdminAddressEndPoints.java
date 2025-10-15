package com.hdor.admin.address.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class AdminAddressEndPoints {
	
	static String UAT_ADMIN_TOKEN="PtRVS1StXtyT0gDYy0G/Bzg4fkgkgkO5KtH/5cAl8/4";
	
	private static RequestSpecification baseRequest() {
		return given()
		.header("Authorization","Bearer "+UAT_ADMIN_TOKEN)
		.header("Application","web")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON);
	}
	
	public static Response getPrimaryAddress() {
		
		return baseRequest()
				.queryParam("type", "delivery")
				.queryParam("runnerId", 262975)
				.when()
				.get(AdminAllAddressRoutes.PRIMARY_ADDRESS);
		
	}
	
	public static Response getAllDeliveryAddress() {
		HashMap<String, Object> payload_data=new HashMap<String, Object>();
		payload_data.put("type", "delivery");
		payload_data.put( "lastIndex", 0);
		payload_data.put("countPerPage", 100);
		payload_data.put("runnerId", "262975");
		
		return baseRequest()
				.body(payload_data)
				.when()
				.post(AdminAllAddressRoutes.ALL_DELIVERY_ADDRESS);  
		
	}
	
	public static Response saveAddress() {
		
		HashMap<String, Object> payload=getAddressPayload();

		return baseRequest()
				.body(payload)
				.post(AdminAllAddressRoutes.SAVE_ADDRESS);
		
	}
	public static Response updateAddress() {
		
		HashMap<String, Object> payload=getAddressPayload();
		payload.put("rowId", 487);
		payload.put("firstName", "JohnJonny");
		
		return baseRequest()
				.body(payload)
				.post(AdminAllAddressRoutes.UPDATE_ADDRESS);
		
	}
	
	public static Response markPrimaryAddress() {
		HashMap<String, Object> payload_data=new HashMap<String, Object>();
		payload_data.put("rowId", 487);
		return baseRequest()
				.body(payload_data)
				.post(AdminAllAddressRoutes.MARK_PRIMARY_ADDRESS);
		
		
	}
	
	public static Response removeAddress() {
		HashMap<String, Object> payload_data=new HashMap<String, Object>();
		payload_data.put("rowId", 487);
		return baseRequest()
				.body(payload_data)
				.post(AdminAllAddressRoutes.REMOVE_ADDRESS);
		
		
	}
	
	private static HashMap<String, Object> getAddressPayload(){
		HashMap<String, Object> payload=new HashMap<String, Object>();
		payload.put("rowId", 487);
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
		payload.put( "stateId", 10);
		payload.put("cityId", 59985);
		payload.put("firstName", "JohnJonny");
		payload.put("lastName", "One");
		return payload;
		
	}

}
