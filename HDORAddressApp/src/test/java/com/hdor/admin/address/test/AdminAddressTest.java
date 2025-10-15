package com.hdor.admin.address.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdor.admin.address.endpoints.AdminAddressEndPoints;

import io.restassured.response.Response;

public class AdminAddressTest {
	public Logger logger;

	@BeforeClass
	public void setup() {
		logger = LogManager.getLogger(this.getClass());
	}

	//@BeforeMethod
	public void delayBetweenTest() throws InterruptedException {
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void getPrimaryAddressTest() {
		logger.info("********** Starting Admin Get Primary Address Test **********");
		Response response=AdminAddressEndPoints.getPrimaryAddress();
		//response.then().log().all();
		//response.getBody();
		System.out.println("Status Code : " + response.getStatusCode());
		System.out.println("Response : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Get Primary Address Test **********");
		
	}
	@Test(priority=1)
	public void getAllDeliveryAddressTest() {
		logger.info("********** Starting Admin All Delivery Address Test **********");
		Response response = AdminAddressEndPoints.getAllDeliveryAddress();
		response.getBody();
		System.out.println("Status Code"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin All Delivery Address Test **********");
	}
	
	@Test(priority=3)
	public void saveAddressTest() {
		logger.info("********** Starting Admin Save Address Test **********");
		Response response = AdminAddressEndPoints.saveAddress();
		response.getBody();
		System.out.println("Status Code"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Save Address Test **********");
	}
	
	@Test(priority=3)
	public void updateAddressTest() {
		logger.info("********** Starting Admin Update Address Test **********");
		Response response = AdminAddressEndPoints.updateAddress();
		response.getBody();
		System.out.println("Status Code"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Update Address Test **********");
	}
	
	@Test(priority=3)
	public void markPrimaryAddressTest() {
		logger.info("********** Starting Admin Mark Primary Address Test **********");
		Response response = AdminAddressEndPoints.markPrimaryAddress();
		response.getBody();
		System.out.println("Status Code"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Mark Primary Address Test **********");
	}
	
	@Test(priority=3)
	public void removeAddressTest() {
		logger.info("********** Starting Admin Remove Address Test **********");
		Response response = AdminAddressEndPoints.removeAddress();
		response.getBody();
		System.out.println("Status Code"+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Remove Address Test **********");
	}

}
