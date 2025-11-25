package JsonPathSession;

import java.util.Map;

import io.restassured.RestAssured;

public class ConvertNestedJsonObjectResponseToJavaMap {

	public static void main(String[] args) {
		
		
		Map jsonResponseAsMap = RestAssured
				.get("https://mocki.io/v1/5749812b-8297-429d-a70b-52b16304f9b1")
				.as(Map.class);
				
				String name = (String) jsonResponseAsMap.get("name");
				System.out.println(name);
				
				Map<String,String>  SkillsMap = (Map<String,String>) jsonResponseAsMap.get("Skills");
				
				System.out.println(SkillsMap.get("name"));
				
				System.out.println(SkillsMap.get("proficiency"));
				
				

	}

}
