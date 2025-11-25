package LibertyBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Createbooking {

	public static void main(String[] args) {
		
		// Build the Request 
		
		RequestSpecification requestspecification = RestAssured.given();
		 requestspecification = requestspecification.log().all();
		requestspecification.baseUri("https://restful-booker.herokuapp.com/");
		requestspecification.basePath("booking");
		
		requestspecification.body("{\r\n"
				+ "			  \"firstname\": \"Arpit\",\r\n"
				+ "			  \"lastname\": \"Choubey\",\r\n"
				+ "			  \"totalprice\": 18,\r\n"
				+ "			  \"depositpaid\": false,\r\n"
				+ "			  \"bookingdates\": {\r\n"
				+ "			    \"checkin\": \"2026-01-01\",\r\n"
				+ "			    \"checkout\": \"2026-01-01\"\r\n"
				+ "			  },\r\n"
				+ "			  \"additionalneeds\": \"Breakfast\"\r\n"
				+ "			}");
		
		
		// requestspecification.contentType("application/json");
		requestspecification.contentType(ContentType.JSON);
		//Hit Request
		Response response = requestspecification.post();
		// Validate the request 
		ValidatableResponse validateresponse = response.then().log().all();
		validateresponse.statusCode(200);
	}

}
