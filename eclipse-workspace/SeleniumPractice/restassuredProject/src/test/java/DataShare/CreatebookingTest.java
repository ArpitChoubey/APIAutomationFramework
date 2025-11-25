package DataShare;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreatebookingTest {
	
	@Test
	public void createBooking(ITestContext context)
	{
		int id = 
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n" + 
			"    \"firstname\" : \"Arpit\",\r\n" + 
			"    \"lastname\" : \"Choubey\",\r\n" + 
			"    \"totalprice\" : 15,\r\n" + 
			"    \"depositpaid\" : false,\r\n" + 
			"    \"bookingdates\" : {\r\n" + 
			"        \"checkin\" : \"2021-01-01\",\r\n" + 
			"        \"checkout\" : \"2021-01-01\"\r\n" + 
			"    },\r\n" + 
			"    \"additionalneeds\" : \"Lunch\"\r\n" + 
			"}")
		.contentType(ContentType.JSON)
		.post() 
		.then()
		.log()
		.all()
		.statusCode(200)
		.extract()
		.jsonPath()
		.getInt("bookingid");
		
		context.setAttribute("bookingid", id);
		
		// context.getSuite().setAttribute("bookingid", id);
		
	}

}
