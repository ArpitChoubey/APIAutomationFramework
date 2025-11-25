package LibertyBooking;

import io.restassured.RestAssured;

public class PathParameterExample {

	public static void main(String[] args) {
		
		RestAssured
		   .given()
		      .log()
		      .all()
		      .baseUri("https://restful-booker.herokuapp.com/")
		      .basePath("booking/{bookingid}")
		      .pathParam("bookingid", 1)
		   .when()
		      .get()
		   .then()
		      .log()
		      .all();
		   

	}

}
