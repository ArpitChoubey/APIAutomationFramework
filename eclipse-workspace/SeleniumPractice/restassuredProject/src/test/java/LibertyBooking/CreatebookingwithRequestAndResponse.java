package LibertyBooking;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreatebookingwithRequestAndResponse {
	
	
	RequestSpecification requestspecification = RestAssured.given()
	  .log()
	  .all()
	.baseUri("https://restful-booker.herokuapp.com/")
	.basePath("booking")
	.contentType(ContentType.JSON)
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
			+ "			}");
	
	
	
	
	ResponseSpecification responsespecification = RestAssured.expect()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.time(Matchers.lessThan(5000L));
	
	static {
		CreatebookingwithRequestAndResponse obj = new CreatebookingwithRequestAndResponse();
	
	
	RestAssured
	.given()
    .spec(obj.requestspecification)
    .when()
	.post()
	
	.then()
	.spec(obj.responsespecification)
	.log()
	.all();

	
	
	
}

}
