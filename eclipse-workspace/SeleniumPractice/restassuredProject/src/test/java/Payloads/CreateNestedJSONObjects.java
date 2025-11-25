package Payloads;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateNestedJSONObjects {

	public static void main(String[] args) {
		
		
		Map<String,Object> Payload = new LinkedHashMap<>();
		
		Payload.put("id", 1);
		Payload.put("firstName", "Arpit");
	    Payload.put("LastName", "Choubey");
		Payload.put("married", false);
	    Payload.put("salary", "123.350");
	    
	    Map<String,Object> addressMap = new LinkedHashMap<String, Object>();
		addressMap.put("no", "#81");
		addressMap.put("streetName", "404 Not Found");
		addressMap.put("city", "BLR");
		addressMap.put("state", "KA");
		
		
		Payload.put("address", addressMap);
		
		RestAssured
		.given()
		.log()
		.all()
		.body(Payload)
		.get();
		

	}

}
