package Payloads;

import java.util.Map;

import io.restassured.RestAssured;

public class ConvertJsonObjectResponseToJavaMap {

	public static void main(String[] args) {


		Map jsonResponseAsMap = RestAssured
				.get("https://mocki.io/v1/025d161e-eaf5-4d25-af05-a94a3edb0256")
				.as(Map.class);
				
				String name = (String) jsonResponseAsMap.get("name");
				System.out.println(name);
				jsonResponseAsMap.keySet().forEach(k -> System.out.println(k));
	}

}
