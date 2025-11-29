package PoJoExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateBookingRetryMechanism {
	
	public static int createbooking() {
		int randomNo = (int)((Math.random()*(50-1))+1);
		if(randomNo % 2 ==0)
		{
			System.out.println("Booking Creating.........");
		return RestAssured
		.given()
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    }")
		   .contentType(ContentType.JSON)
		   .post("https://restful-booker.herokuapp.com/booking")
		   .statusCode();
	}
		else {
			System.out.println("Booking Creating failed.........");
			return 0;
		}

	}
}
