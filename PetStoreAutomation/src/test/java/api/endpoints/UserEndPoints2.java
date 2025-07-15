package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ResourceBundle;

import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Created for perform Create, Read, Update, Delete request operations on User API through properties file

public class UserEndPoints2 {
	
	static ResourceBundle getUrl(){
		ResourceBundle routes=ResourceBundle.getBundle("routes"); //load properties file
		return routes;
	}

	public static Response createUser(User payload) {
		
		String user_post_url=getUrl().getString("user_post_url");
		
		
		Response res=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		
		.when()
			.post(user_post_url);
		
		return res;
	}
	
	public static Response readUser(String userName) {
		String user_get_url=getUrl().getString("user_get_url");
		
		Response res=given()
			//.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
		
		.when()
			.get(user_get_url);
		
		return res;
	}
	public static Response updateUser(String userName, User payload) {
		String user_update_url=getUrl().getString("user_update_url");
		
		Response res=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
			.body(payload)
		
		.when()
			.put(user_update_url);
		
		return res;
	}
	public static Response deleteUser(String userNname) {
		
		String user_delete_url=getUrl().getString("user_delete_url");
		
		Response res=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userNname)
		
		.when()
			.delete(user_delete_url);
		
		return res;
	}
}
