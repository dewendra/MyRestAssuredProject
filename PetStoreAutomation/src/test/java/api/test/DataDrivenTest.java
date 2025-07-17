package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payloads.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DataDrivenTest {
	
	
	@Test(priority = 1,dataProvider = "data", dataProviderClass = DataProviders.class)
	public void postUserTest(String userID, String userName, String fName, String lName, String email, String pwd,String ph) {
		
		User userPayload=new User();
		userPayload.setId(Integer.parseInt(userID));
		userPayload.setUsername(userName);
		userPayload.setFirstName(fName);
		userPayload.setLastName(lName);
		userPayload.setEmail(email);
		userPayload.setPassword(pwd);
		userPayload.setPhone(ph);
		
		
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();
		response.getBody();
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	
	@Test(priority = 2, dataProvider = "userNames", dataProviderClass = DataProviders.class)
	public void deleteUserByNameTest(String userName) {
		System.out.println("user name : "+userName);
		Response response = UserEndPoints.deleteUser(userName);
		System.out.println("++++++++++++++++++++++++++++************+++++++++++++++++++++++++++++");
		System.out.println("DELETED");
		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
