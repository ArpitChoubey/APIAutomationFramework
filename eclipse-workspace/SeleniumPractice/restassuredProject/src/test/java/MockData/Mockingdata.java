package MockData;

import io.restassured.RestAssured;

public class Mockingdata {

	public static void main(String[] args) {
		

		RestAssured
			.given()
			.log()
			.all()
			.get("https://mocki.io/v1/7a6690cb-9a9b-46e2-a0c3-4bf304d1161a")
			.then()
			.log()
			.all();

	}

}
