package JacksonAnnontationExample;

import PojoClasses.Person;
import tools.jackson.databind.ObjectMapper;

public class Deserialization {

	public static void main(String[] args) {
		
		
		String json = "{\r\n"
				+ "  \"age\" : 35,\r\n"
				+ "  \"name\" : \"Arpit\"\r\n"
				+ "}";
		
		ObjectMapper mapper = new ObjectMapper();
		Person  P2 = mapper.readValue(json, Person.class);
		System.out.println(P2.getName());
		System.out.println(P2.getAge());
	}

}
