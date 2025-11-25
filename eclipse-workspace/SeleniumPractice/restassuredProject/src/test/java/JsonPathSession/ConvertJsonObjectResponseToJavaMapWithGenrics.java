package JsonPathSession;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonObjectResponseToJavaMapWithGenrics {

	public static void main(String[] args) {
		
		
		Map jsonResponseAsMap = RestAssured
				.get("https://mocki.io/v1/a35e039c-0707-457c-a586-0bc7bb80b486")
				.as(new TypeRef<Map<String,Object>>(){});
				
				String name = (String) jsonResponseAsMap.get("name");
				System.out.println(name);
				jsonResponseAsMap.keySet().forEach(k -> System.out.println(k));

	}

}
