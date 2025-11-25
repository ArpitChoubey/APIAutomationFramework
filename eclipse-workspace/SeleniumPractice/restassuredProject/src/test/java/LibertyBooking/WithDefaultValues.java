package LibertyBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class WithDefaultValues {

	public static void main(String[] args) {
		
		
		RestAssured
		.given()
		.log()
		.all()
		//.baseUri("https://restful-booker.herokuapp.com/")
		//.basePath("booking")
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
		.statusCode(200);


	}

}
