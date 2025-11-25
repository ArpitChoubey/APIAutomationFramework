package JsonPathSession;

import io.restassured.path.json.JsonPath;

public class JsonPathforaSimpleJsonArray {

	public static void main(String[] args) {
		
		
		String JsonArray = "[\r\n"
				+ "  10,\r\n"
				+ "  20,\r\n"
				+ "  30,\r\n"
				+ "  40\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(JsonArray);
		System.out.println(jp.getString("[3]"));
		System.out.println(jp.getList("$").size());

	}

}
