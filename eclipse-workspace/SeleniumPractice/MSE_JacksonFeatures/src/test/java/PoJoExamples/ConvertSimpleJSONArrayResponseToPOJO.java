package PoJoExamples;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertSimpleJSONArrayResponseToPOJO {

	public static void main(String[] args) {
		
		
	Location[] loc =	RestAssured.get("https://mocki.io/v1/7e30939b-abc6-458b-abba-67e359aeb929")
		.as(Location[].class);

	
	System.out.println("Number of Location :"+loc.length);
	System.out.println(loc[1].getCountry());
	
	// TypeRef is an abstract class & using Anonymous inner class  and used to specific type of information when Deserializing a Response 
	List<Location> locations = RestAssured.get("https://mocki.io/v1/7e30939b-abc6-458b-abba-67e359aeb929")
			.as(new TypeRef<List<Location>>() {});
	
	System.out.println("Number of Location :"+locations.size());
	System.out.println(locations.get(0).getState());
	System.out.println(locations.get(1).getStreet());
	}

}
