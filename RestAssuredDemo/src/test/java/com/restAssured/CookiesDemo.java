package com.restAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {
	
	//@Test(priority=1)
	void testCookies() {
		
		given()
			
		.when()
			.get("https://www.google.com/")
		.then()
			.statusCode(200)
			.cookie("AEC","AVh_V2jqrcOhD3P5SmL0fdfxk-_FRamYAamPnREItdlmio6rBPRnhjZRx3I")
			.cookie("NID","524%3DkjD91osbSRtlr2FhM0lsFJK-dVzprl0B1CCgFFlsNLqI9eIo-CE-yV8Oj0WOFU4DEuVSu_eXaBjTF3WjjUIjdHIhkxX-As3JCVQQUha-vD8hBf5KHj0-ztdWFTOJZMNgaTGfw8wJ01arkzW-GTfYzlfhPbOyZiVrijScI7yoNrt9SBiDCFD1AbHdOhMfYklo2A1mEtzbjsyzSYcJDg")
		
			.log().all();
	}
	@Test(priority=2)
	void getCookiesInfo() {
		
		Response res=given()
			
		.when()
			.get("https://www.google.com/");
		//get single cookies info
		//String cookie_value=res.getCookie("AEC");
		//System.out.println("Value of cookies AEC : "+cookie_value);
		
		//get all cookies info
			Map<String, String> cookiesmap=res.getCookies();
			//System.out.println(cookiesmap.keySet());
			//System.out.println(cookiesmap.values());
			
			for(String key:cookiesmap.keySet()) {
				String cookie_value=res.getCookie(key);
				System.out.println("Value of cookies "+key+": "+cookie_value);
				
			}
		
	}

}
