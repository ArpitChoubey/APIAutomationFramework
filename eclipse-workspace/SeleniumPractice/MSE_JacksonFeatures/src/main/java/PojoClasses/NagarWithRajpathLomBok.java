package PojoClasses;

import tools.jackson.databind.ObjectMapper;

public class NagarWithRajpathLomBok {

	public static void main(String[] args) {
		
		
		Rajpath R = new Rajpath();
		R.setFirstName("Arpit");
		R.setage(35);
		
		Rajpath R1 = Rajpath.builder();
		R.setFirstName("Arpit");
		R.setage(35).build();
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper..writerWithDefaultPrettyPrinter()
				.writeValueAsString(R1));
		
	}

}
