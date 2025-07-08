package api.test;

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
	}

	@Test(priority = 1)
	public void createUserTest() {
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();
		response.getBody();
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test(priority = 2)
	public void getUserByNameTest() {
		Response response = UserEndPoints.readUser(this.userPayload.getUsername());
		response.then().log().all();
		response.getBody();
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test(priority = 3)
	public void updateUserTest() {

		userPayload.setEmail(faker.internet().emailAddress());
		userPayload.setPhone(faker.phoneNumber().cellPhone());

		Response response = UserEndPoints.updateUser(this.userPayload.getUsername(), userPayload);
		response.then().log().all();
		response.getBody();
		Assert.assertEquals(response.getStatusCode(), 200);

		Response responseAfterUpdate = UserEndPoints.readUser(this.userPayload.getUsername());
		responseAfterUpdate.then().log().all();
		responseAfterUpdate.getBody();

	}

	@Test(priority = 4)
	public void deleteUserByNameTest() {
		Response response = UserEndPoints.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);

	}

}
