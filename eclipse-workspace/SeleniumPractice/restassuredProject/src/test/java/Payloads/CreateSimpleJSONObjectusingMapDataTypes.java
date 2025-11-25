package Payloads;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJSONObjectusingMapDataTypes {

	public static void main(String[] args) {
		
		
Map<String,Object> JsonObjectPayload = new LinkedHashMap<>();
		
		JsonObjectPayload.put("id", 1);
		JsonObjectPayload.put("firstName", "Arpit");
		JsonObjectPayload.put("LastName", "Choubey");
		JsonObjectPayload.put("married", false);
		JsonObjectPayload.put("salary", "123.350");
		
		RestAssured
		.given()
		.log()
		.all()
		.body(JsonObjectPayload)
		.get();
	}

}
