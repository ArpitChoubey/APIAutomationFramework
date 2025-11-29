package PoJoExamples;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class VerifyTypeofResponse {

	public static void main(String[] args) {
		
		// To Verify Response is a JSON Object i.e. Map 
		RestAssured.get("https://mocki.io/v1/68585b8e-ab4a-477a-b3dc-570cf4a87543")
		.then()
         .body("", Matchers.instanceOf(Map.class));
		
		// To Verify Response is a JSON Array i.e. List
		RestAssured.get("https://mocki.io/v1/68585b8e-ab4a-477a-b3dc-570cf4a87543")
		.then()
         .body("", Matchers.instanceOf(List.class));
		
		// To Verify a part of Response is a JSON Array i.e. List
		RestAssured.get("https://mocki.io/v1/68585b8e-ab4a-477a-b3dc-570cf4a87543")
		.then()
         .body("map", Matchers.instanceOf(List.class));
	}

}
