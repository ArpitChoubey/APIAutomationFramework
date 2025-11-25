package JsonPathSession;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonIntroduction {
	
	@Test
	public void jsonpathdemo() {
		
		String json = ("{\r\n"
				+ "			  \"firstname\": \"Arpit\",\r\n"// "123/" - ClassCastException if Arpit changed into 123/
				+ "			  \"lastname\": \"Choubey\",\r\n"
				+ "			}");
		
		JsonPath jsonpath = new JsonPath(json);
		
		String firstname = jsonpath.getString("firstname");
		
		int fnaam = jsonpath.getInt("firstname1");  // NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value
		
		System.out.println(fnaam);
		
		
		 System.out.println(firstname);
		
		Object fname = jsonpath.get("firstname");
		
		System.out.println(fname);
		
              //  int i = jsonpath.get("firstname");// ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
		
		// System.out.println(fname);
		
		String s = "Arpit";
		
		System.out.println(Integer.parseInt(s)); // NumberFormatException: For input string: "Arpit"
		
		 System.out.println((Object)jsonpath.get("$"));
		 
		 System.out.println((Object)jsonpath.getString("$"));
		 
		 System.out.println((Object)jsonpath.get());
		 
		 System.out.println((Object)jsonpath.getString(""));
		
		
		
	}

}
