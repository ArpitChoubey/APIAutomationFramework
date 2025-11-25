package DataShare;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SharedataAmongMethods {
	
	private int bookingId;
	
	@Test(priority =1)
	public void CreateBooking() {
		int bookingId =
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n"
				+ "			  \"firstname\": \"Arpit\",\r\n"
				+ "			  \"lastname\": \"Choubey\",\r\n"
				+ "			  \"totalprice\": 18,\r\n"
				+ "			  \"depositpaid\": false,\r\n"
				+ "			  \"bookingdates\": {\r\n"
				+ "			    \"checkin\": \"2026-01-01\",\r\n"
				+ "			    \"checkout\": \"2026-01-01\"\r\n"
				+ "			  },\r\n"
				+ "			  \"additionalneeds\": \"Breakfast\"\r\n"
				+ "			}")
		.contentType(ContentType.JSON)
		.post()
		.then()
		.log()
		.all()
		.statusCode(200)
		.extract()
		.jsonPath()
		.getInt("bookingid");
		
		Response response = 
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+bookingId)
				.then().log().all().extract().response();
	}
	@Test(priority =2)
	public void RetriveBooking() {
		
		Response response = 
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+bookingId)
				.then().log().all().extract().response();
	}
}
