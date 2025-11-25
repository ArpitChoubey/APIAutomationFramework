package LibertyBooking;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class DefaultValues1 {

	
		
		  @BeforeTest
		    public void Setup() {
		        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		        RestAssured.basePath = "/booking";
		        System.out.println("In Setup");
		        RestAssured.requestSpecification = RestAssured.given().log().all();
		        RestAssured.responseSpecification = RestAssured.expect().statusCode(200);
		    }
		  public void createbooking3()
          {
			  RestAssured
				.given()
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
				.all();
				
         
	}
		  @Test
		  public void GetBook() {
			  
			  RestAssured
				.given()
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
				.all();
			
			  
		  }

}
