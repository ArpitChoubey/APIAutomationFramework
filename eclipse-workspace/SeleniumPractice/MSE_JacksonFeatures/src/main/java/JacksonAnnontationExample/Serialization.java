package JacksonAnnontationExample;

import PojoClasses.Person;
import tools.jackson.databind.ObjectMapper;

public class Serialization {

	public static void main(String[] args) {
		 Person P = new Person();
		 P.setName("Anjali");
		 P.setAge(34);
		 
		 ObjectMapper mapper = new ObjectMapper();
			String Jsonformat2 = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(P);
			System.out.println(Jsonformat2);
		 

	}

}
