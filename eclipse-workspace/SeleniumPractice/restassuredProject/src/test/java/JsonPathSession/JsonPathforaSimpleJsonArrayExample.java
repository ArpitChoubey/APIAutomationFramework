package JsonPathSession;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathforaSimpleJsonArrayExample {

	public static void main(String[] args) {
		
		String JsonArray = " [\r\n"
				+ "  [\r\n"
				+ "    \"10\",\r\n"
				+ "    \"20\",\r\n"
				+ "    \"30\",\r\n"
				+ "    \"40\",\r\n"
				+ "    \"50\"\r\n"
				+ "  ],\r\n"
				+ "  [\r\n"
				+ "    \"100\",\r\n"
				+ "    \"200\",\r\n"
				+ "    \"300\",\r\n"
				+ "    \"400\",\r\n"
				+ "    \"500\",\r\n"
				+ "    \"600\"\r\n"
				+ "  ]\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(JsonArray);
		
		System.out.println(jp.getString("[1][3]"));
		System.out.println(jp.getList("$").size());
		

List<Object> internallist = (List<Object>) jp.getList("$").get(1);
System.out.println(internallist.size());
		

	}

}
