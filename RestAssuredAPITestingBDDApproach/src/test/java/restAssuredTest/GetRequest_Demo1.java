package restAssuredTest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetRequest_Demo1 {
	
	@Test
	public void getWeatherDetails(){
		
	
	
	given()
	
	.when()
		.get("https://demoqa.com/BookStore/v1/Books")
	
	.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		//.assertThat().body("City", equalTo("Hyderabad"))
		.header("Content-Type", "application/json; charset=utf-8")
		.log().all();
	}
}
