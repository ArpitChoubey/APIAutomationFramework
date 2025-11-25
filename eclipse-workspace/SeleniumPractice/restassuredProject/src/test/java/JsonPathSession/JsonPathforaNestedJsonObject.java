package JsonPathSession;

import io.restassured.path.json.JsonPath;

public class JsonPathforaNestedJsonObject {

	public static void main(String[] args) {
		
		
		String jsonObject = ("{\r\n"
				+ "  \"firstName\": \"Arpit\",\r\n"
				+ "  \"lastName\": \"choubey\",\r\n"
				+ "  \"age\": 28,\r\n"
				+ "  \"address\": {\r\n"
				+ "    \"flatNo\": 401,\r\n"
				+ "    \"buildingName\": \"ABC\",\r\n"
				+ "    \"streetName\": \"XYZ\",\r\n"
				+ "    \"pin\": 123456\r\n"
				+ "  },\r\n"
				+ "  \"salary\": 10.50,\r\n"
				+ "  \"married\": false\r\n"
				+ "}");
		
		JsonPath jp = new JsonPath(jsonObject);
		
		 String firstName = jp.getString("firstName");
	       System.out.println(firstName);

        int fn = jp.getInt("address.flatNo");
        System.out.println(fn);
        
        String bn = jp.getString("address.buildingName");
        System.out.println(bn);
        
        Object obj = jp.get("address");
        System.out.println(obj);
        
       int ln =  jp.getInt("address.pin");
       System.out.println(ln);
       
      
        
	}

}
