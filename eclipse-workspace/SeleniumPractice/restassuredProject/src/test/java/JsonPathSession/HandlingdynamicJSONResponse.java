package JsonPathSession;

import java.awt.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingdynamicJSONResponse {

	

	public static void main(String[] args) {
		
		
		Response response = RestAssured.get("https://mocki.io/v1/043b0517-a426-4c7a-baaa-02fc735c4f1f");
		
		Map responseasMap = response.as(Map.class);
		
		System.out.println(responseasMap.keySet());
		
		// Exception in thread "main" com.fasterxml.jackson.databind.exc
				//.MismatchedInputException: Cannot deserialize instance 
				//of `java.util.LinkedHashMap<java.lang.Object,java.lang.Object>` 
				//out of START_ARRAY token
		
		Response response1 = RestAssured.get("https://mocki.io/v1/043b0517-a426-4c7a-baaa-02fc735c4f1f");
		
		List responseAsList = response.as(List.class);
		
		System.out.println(responseAsList.size());
		
		//Exception in thread "main" com.fasterxml.jackson.databind.exc
				//.MismatchedInputException: Cannot deserialize instance 
				// of `java.util.ArrayList<java.lang.Object>` out of START_OBJECT token
		
		

	}

}
