package JacksonAnnontationExample;

import PojoClasses.Staff;
import tools.jackson.databind.ObjectMapper;

public class StaffwithAllData {

	public static void main(String[] args) {
		
		
		 Staff s1 = new Staff();
		 s1.setAge(33);
		 s1.setName("Rajakahani");
		 s1.setAddress("Patna");
		 s1.setMarried(false);
		 s1.setMobileNo("7685432198");
		 
		 ObjectMapper mapper = new ObjectMapper();
			String Jsonformat1 = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(s1);
			System.out.println(Jsonformat1);
		 
		 
	}

}
