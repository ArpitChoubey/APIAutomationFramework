package DataShare;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class GetBookingDetails {

	
	@Test
	public void GetBooking(ITestContext context)
	{
	
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+context.getAttribute("bookingid"))
				.then().log().all().extract().response();
				
				// +context.getSuite().getAttribute("bookingid"); For Isuite
		
	}
		
}
