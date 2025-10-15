package com.hdor.user.address.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdor.user.address.endpoints.UserAddressEndPoints;

import io.restassured.response.Response;

public class UserAddressTest {

	public Logger logger;
	
	@BeforeClass
	public void setup() {
		logger=LogManager.getLogger(this.getClass());
	}
	//@BeforeMethod
	public void delayBetweenTests() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void getUserPrimaryAddressTest() {
		logger.info("******************** User Primary Address Test Started **********************");
		Response response=UserAddressEndPoints.getUserPrimaryAddress();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response data : "+response.asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("******************** User Primary Address Test End **********************");
	}
	
	@Test(priority=2)
	public void getAllDeliveryAddressTest() {
		logger.info("******************** All Delivery Address Test Started **********************");
		Response response=UserAddressEndPoints.getAllDeliveryAddress();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response data : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("******************** All Delivery Address Test End **********************");
	}
	
	@Test(priority=3)
	public void getAllBillingAddressTest() {
		logger.info("******************** All Billing Address Test Started **********************");
		Response response=UserAddressEndPoints.getAllBillingAddress();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response data : "+response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("******************** All Billing Address Test End **********************");
	}
	
	@Test(priority=4)
	public void saveAddressTest() {
		logger.info("******************** Save Address Test Started ********************");
		Response response=UserAddressEndPoints.saveAddress();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response data : "+response.asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("******************** Save Address Test End **********************");
	}
	@Test(priority=5)
	public void updateAddressTest() {
		logger.info("******************** Update Address Test Started ********************");
		Response response=UserAddressEndPoints.updateAddress();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response data : "+response.asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("******************** Update Address Test End **********************");
	}
	@Test(priority=6)
	public void markAddressPrimaryTest() {
		logger.info("******************** Mark Address Primary Test Started ********************");
		Response response=UserAddressEndPoints.markAddressPrimary();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response data : "+response.asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("******************** Mark Address Primary Test End **********************");
	}
	@Test(dependsOnMethods = {"getAllDeliveryAddressTest"})
	public void removeAddress() {
		logger.info("******************** Mark Address Primary Test Started ********************");
		Response response=UserAddressEndPoints.removeAddress();
		response.then().log().all();
		response.getBody();
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response data : "+response.asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("******************** Mark Address Primary Test End **********************");
	}
	
}
