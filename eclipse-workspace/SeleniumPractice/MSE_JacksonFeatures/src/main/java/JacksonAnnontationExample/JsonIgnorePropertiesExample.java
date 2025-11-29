package JacksonAnnontationExample;

import PojoClasses.Employee;
import tools.jackson.databind.ObjectMapper;

public class JsonIgnorePropertiesExample {

	public static void main(String[] args) {
		
		String JsonString = "{\r\n"
				+ "  \"name\": \"Arpit\",\r\n"
				+ "  \"age\": 35,\r\n"
				+ "  \"married\": true,\r\n"
				+ "  \"address\": \"BLR\",\r\n"
				+ "  \"mobileNo\": \"213123\"\r\n"
				+ "}";
		
		
		ObjectMapper mapper1 = new ObjectMapper();
		Employee empObj = mapper1.readValue(JsonString, Employee.class);
		
		System.out.println(empObj.getName());
		System.out.println(empObj.getAge());
		System.out.println(empObj.getAddress());
		System.out.println(empObj.getMobileNo());
		System.out.println(empObj.isMarried());
		

	}

}
