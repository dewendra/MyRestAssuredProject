package com.hdor.charityApp.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hdor.charityApp.endpoints.CharityEndPoint;
import com.hdor.charityApp.endpoints.CharityEndPoints;
import com.hdor.charityApp.payloads.Ngo;

import io.restassured.response.Response;

public class CharityTest {
	Ngo ngoPayload;
	public Logger logger;

	@BeforeClass
	public void setUp() {
		//ngoPayload=new Ngo();
		//ngoPayload.setEventId(156);
		logger = LogManager.getLogger(this.getClass());
	}

	@Test(priority = 1)
	public void categoryTest() {
		logger.info("***************************Testing Category***************************");
		//Response response = CharityEndPoints.categoryList();
		Response response = CharityEndPoint.activeRequest();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code: " + response.statusCode());
		System.out.println("Response: " + response.asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("***************************Category find*****************************");

	}

}
