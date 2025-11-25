package JsonPathSession;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class InlineAssertionsforArrays {

	public static void main(String[] args) {
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/booking")
		.when()
			.get()
		.then()
			.log()
			.all()
			.body("bookingid",Matchers.hasItems(9,10));
	}

}
