package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Created for perform Create, Read, Update, Delete request operations on User API

public class UserEndPoints {

	public static Response createUser(User payload) {
		Response res = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(payload)

				.when().post(Routes.user_post_url);

		return res;
	}

	public static Response readUser(String userName) {
		Response res = given()
				// .contentType(ContentType.JSON)
				.accept(ContentType.JSON).pathParam("username", userName)

				.when().get(Routes.user_get_url);

		return res;
	}

	public static Response updateUser(String userName, User payload) {
		Response res = given().contentType(ContentType.JSON).accept(ContentType.JSON).pathParam("username", userName)
				.body(payload)

				.when().put(Routes.user_update_url);

		return res;
	}

	public static Response deleteUser(String userNname) {
		Response res = given().contentType(ContentType.JSON).accept(ContentType.JSON).pathParam("username", userNname)

				.when().delete(Routes.user_delete_url);

		return res;
	}
}
