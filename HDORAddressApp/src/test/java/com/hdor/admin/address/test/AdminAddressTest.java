package com.hdor.admin.address.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdor.admin.address.endpoints.AdminAddressEndPoints;

import io.restassured.module.jsv.JsonSchemaValidator;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

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
	@Test(priority=1)
	public void getPrimaryAddressTest() {
		logger.info("********** Starting Admin Get Primary Address Test **********");
		Response response=AdminAddressEndPoints.getPrimaryAddress();
		//response.then().log().all();
		//response.getBody();
		System.out.println("GetPrimaryAddressTest Status Code : " + response.getStatusCode());
		System.out.println("GetPrimaryAddressTest Response : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("API Response validated successfully");
		response.then().assertThat().body(matchesJsonSchemaInClasspath("GetPrimaryAddressSchema.json"));
		
		logger.info("********** Completed Admin Get Primary Address Test **********");
		
	}
	@Test(priority=2)
	public void getAllDeliveryAddressTest() {
		logger.info("********** Starting Admin All Delivery Address Test **********");
		Response response = AdminAddressEndPoints.getAllDeliveryAddress();
		//response.getBody();
		System.out.println("GetAllDeliveryAddressTest Status Code"+response.getStatusCode());
		System.out.println("GetAllDeliveryAddressTest Response : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin All Delivery Address Test **********");
	}
	
	@Test(priority=3)
	public void saveAddressTest() {
		logger.info("********** Starting Admin Save Address Test **********");
		Response response = AdminAddressEndPoints.saveAddress();
		//response.getBody();
		System.out.println("SaveAddressTest Status Code"+response.getStatusCode());
		System.out.println("SaveAddressTest Response : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Save Address Test **********");
	}
	
	@Test(priority=4)
	public void updateAddressTest() {
		logger.info("********** Starting Admin Update Address Test **********");
		Response response = AdminAddressEndPoints.updateAddress();
		//response.getBody();
		System.out.println("UpdateAddressTest Status Code"+response.getStatusCode());
		System.out.println("UpdateAddressTest Response : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Update Address Test **********");
	}
	
	@Test(priority=5)
	public void markPrimaryAddressTest() {
		logger.info("********** Starting Admin Mark Primary Address Test **********");
		Response response = AdminAddressEndPoints.markPrimaryAddress();
		//response.getBody();
		System.out.println("MarkPrimaryAddressTest Status Code"+response.getStatusCode());
		System.out.println("MarkPrimaryAddressTest Response : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Mark Primary Address Test **********");
	}
	
	@Test(priority=6)
	public void removeAddressTest() {
		logger.info("********** Starting Admin Remove Address Test **********");
		Response response = AdminAddressEndPoints.removeAddress();
		//response.getBody();
		System.out.println("RemoveAddressTest Status Code"+response.getStatusCode());
		System.out.println("RemoveAddressTest Response : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("API Response validated successfully");
		logger.info("********** Completed Admin Remove Address Test **********");
	}

}
