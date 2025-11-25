package JsonPathSession;

import io.restassured.path.json.JsonPath;

public class JsonPathforaSimpleJsonObject {

	private static final String jsonObject = null;

	public static void main(String[] args) {
		
		
		 String jsonObject = "{\r\n"
	                + "  \"firstname\": \"Arpit\",\r\n"
	                + "  \"lastname\": \"Choubey\",\r\n"
	                + "  \"age\": 18,\r\n"
	                + "  \"married\": false,\r\n"
	                + "  \"additionalneeds\": \"Breakfast\"\r\n"
	                + "}";
		
		 JsonPath jp = new JsonPath(jsonObject);

	        String firstName = jp.getString("firstname");
	        System.out.println(firstName);

	        int age = jp.getInt("age");
	        System.out.println(age);

	        boolean marry = jp.getBoolean("married");
	        System.out.println(marry);

	}

}
