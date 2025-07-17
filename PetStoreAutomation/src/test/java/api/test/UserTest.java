package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payloads.User;
import io.restassured.response.Response;

public class UserTest {
	Faker faker;
	User userPayload;
	public Logger logger;

	@BeforeClass
	public void setUp() {
		faker = new Faker();
		userPayload = new User();
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().emailAddress());
		userPayload.setPassword(faker.internet().password());
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		
		//logs
		logger=LogManager.getLogger(this.getClass());
	}

	@Test(priority = 1)
	public void createUserTest() {
		logger.info("***************************Creating User*****************************");
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();
		response.getBody();
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("***************************User created*****************************");

	}

	@Test(priority = 2)
	public void getUserByNameTest() {
		logger.info("***************************Getting User by Username*****************************");
		Response response = UserEndPoints.readUser(this.userPayload.getUsername());
		response.then().log().all();
		response.getBody();
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("***************************User Found*****************************");

	}

	@Test(priority = 3)
	public void updateUserTest() {
		logger.info("***************************Updating User by Username*****************************");
		userPayload.setEmail(faker.internet().emailAddress());
		userPayload.setPhone(faker.phoneNumber().cellPhone());

		Response response = UserEndPoints.updateUser(this.userPayload.getUsername(), userPayload);
		response.then().log().all();
		response.getBody();
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("***************************User Updated*****************************");

		Response responseAfterUpdate = UserEndPoints.readUser(this.userPayload.getUsername());
		responseAfterUpdate.then().log().all();
		responseAfterUpdate.getBody();
		

	}

	@Test(priority = 4)
	public void deleteUserByNameTest() {
		logger.info("***************************Deleting User by Username*****************************");
		Response response = UserEndPoints.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("***************************User Deleted*****************************");

	}

}
