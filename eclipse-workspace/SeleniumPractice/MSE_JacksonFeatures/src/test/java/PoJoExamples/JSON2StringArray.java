package PoJoExamples;

import java.math.BigDecimal;

import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;

public class JSON2StringArray {

	public static void main(String[] args) {
		
		
		String A = "{\r\n"
				+ "    \"name\": \"Arpit\",\r\n"
				+ "    \"department\": \"QA Automation\",\r\n"
				+ "    \"salary\": 85000.50,\r\n"
				+ "    \"bonus\": \"85000.50\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "    \"name\": \"Amit\",\r\n"
				+ "    \"department\": \"QA Automation\",\r\n"
				+ "    \"salary\": 95000.51,\r\n"
				+ "    \"bonus\": \"95000.51\"\r\n"
				+ "}";
		
		
	        
	        String name = JsonPath.from(response).getString(
	                "find {new BigDecimal(it.salary.toString()) == new BigDecimal('85000.50')}.name");
	        System.out.println(name);

	        String name1 = JsonPath.from(response)
	                .using(JsonPathConfig.jsonPathConfig().numberReturnType(JsonPathConfig.NumberReturnType.BIG_DECIMAL))
	                .getString("find {it.salary == 85000.50}.name");
	        System.out.println(name1);

	        System.out.println(new BigDecimal(85000.50));
	        System.out.println(new BigDecimal(95000.51));

	}

}
