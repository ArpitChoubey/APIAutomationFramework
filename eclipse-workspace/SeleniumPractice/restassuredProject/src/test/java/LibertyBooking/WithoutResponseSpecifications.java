package LibertyBooking;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class WithoutResponseSpecifications {
	
	ResponseSpecification responsespecification;
	
	@BeforeClass
	public void setupExpectation()
	{
       responsespecification = RestAssured.expect();
		
		responsespecification.statusCode(200);
		responsespecification.contentType(ContentType.JSON);
		responsespecification.time(Matchers.lessThan(5000L));
	}
	
	@Test
	public void CreateBook()
	{
		
		
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
		.spec(responsespecification);
		
	}

	
	@Test
	public void CreateBook2()
	{
		
		
		
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
		.spec(responsespecification);
		
	}

}
