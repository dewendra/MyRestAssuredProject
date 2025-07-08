package api.endpoints;

/*
 Swagger URL-- https://petstore.swagger.io
 Create User(post)--https://petstore.swagger.io/v2/user
 GetUser(get)--https://petstore.swagger.io/v2/user/{username}
 UpdateUser(put)--https://petstore.swagger.io/v2/user/{username}
 DeleteUser(delete)--https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2";

	// User Module
	public static String user_post_url = base_url + "/user";
	public static String user_get_url = base_url + "/user/{username}";
	public static String user_update_url = base_url + "/user/{username}";
	public static String user_delete_url = base_url + "/user/{username}";

	// Store Module
	public static String store_post_url = base_url + "/store";
	public static String store_get_url = base_url + "/store";
	public static String store_update_url = base_url + "/store";
	public static String store_delete_url = base_url + "/store";

	// Pet Module
	public static String pet_post_url = base_url + "/pet";
	public static String pet_get_url = base_url + "/pet/{petId}";
	public static String pet_update_url = base_url + "/pet/{petId}";
	public static String pet_delete_url = base_url + "/pet/{petId}";

}
