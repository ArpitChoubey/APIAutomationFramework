package LibertyBooking;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class MeasureResponseTime {

	public static void main(String[] args) {
	
		
		
		ValidatableResponse response = RestAssured.given()
		
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
		.then();
		
		Long responseTimeinMS = response.extract().time();
		
	System.out.println("Response Time in MS :"+responseTimeinMS);
	
	Long responseTimeinSeconds = response.extract().timeIn(TimeUnit.SECONDS);
	
	System.out.println("Response Time in Seconds :"+responseTimeinSeconds);
	
	Long responseTimeinMS1 = response.extract().time();
	
	System.out.println("Response Time in MS :"+responseTimeinMS1);
	
	Long responseTimeinSeconds1 = response.extract().timeIn(TimeUnit.SECONDS);
	
	System.out.println("Response Time in Seconds :"+responseTimeinSeconds1);
	
	response.time(Matchers.lessThan(5000L));
	
	response.time(Matchers.greaterThan(2000L));
	
	response.time(Matchers.both(Matchers.greaterThan(2000L)).and(Matchers.lessThan(5000L)));
	
	}
	

}
