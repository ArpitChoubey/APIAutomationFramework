package LibertyBooking;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParameterExample3 {

	public static void main(String[] args) {
		
		Map<String, Object> pathParameters = new HashMap<>();
		pathParameters.put("bookingid", 2);

		RestAssured
		   .given()
		      .log().all()
		      .baseUri("https://restful-booker.herokuapp.com/")
		      .basePath("booking/{bookingid}")
		      .pathParams(pathParameters)
		   .when()
		      .get()
		   .then()
		      .log().all();
		 
	}

}
