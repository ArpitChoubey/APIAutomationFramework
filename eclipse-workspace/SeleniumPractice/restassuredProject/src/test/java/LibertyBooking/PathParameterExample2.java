package LibertyBooking;

import io.restassured.RestAssured;

public class PathParameterExample2 {

	public static void main(String[] args) {
		
		
		RestAssured
		   .given()
		      .log()
		      .all()
		      .pathParam("bookingid", 2)
		   .when()
		      .get("https://restful-booker.herokuapp.com/booking/{bookingid}")
		   .then()
		      .log()
		      .all();
		   


	}

}
