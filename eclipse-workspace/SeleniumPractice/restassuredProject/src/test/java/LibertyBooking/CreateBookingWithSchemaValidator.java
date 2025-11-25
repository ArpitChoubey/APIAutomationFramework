package LibertyBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class CreateBookingWithSchemaValidator {

	private static final String JsonSchemaValidator = null;

	public static void main(String[] args) {
		
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n" + 
			"    \"firstname\" : \"Arpit\",\r\n" + 
			"    \"lastname\" : \"choubey\",\r\n" + 
			"    \"totalprice\" : 15,\r\n" + 
			"    \"depositpaid\" : false,\r\n" + 
			"    \"bookingdates\" : {\r\n" + 
			"        \"checkin\" : \"2021-01-01\",\r\n" + 
			"        \"checkout\" : \"2021-01-01\"\r\n" + 
			"    },\r\n" + 
			"    \"additionalneeds\" : \"Lunch\"\r\n" + 
			"}")
		.contentType(ContentType.JSON)
		// Hit the request and get the response
		.post()
		// Validate the response 
		.then()
		.log()
		.all()
		.statusCode(200)
		.body(JsonSchemaValidator.matchesJsonSchema("JsonSchemaValidator.json"));
	
	}

}
