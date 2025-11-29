package JacksonAnnontationExample;

import PojoClasses.Employee;
import tools.jackson.databind.ObjectMapper;

public class EmployeewithAllData {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		emp1.setName("Arpit");
		emp1.setAge(35);
		emp1.setAddress("BLR");
		emp1.setMarried(true);
		emp1.setMobileNo("98279346571");

		
		ObjectMapper mapper = new ObjectMapper();
		String Jsonformat = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(emp1);
		System.out.println(Jsonformat);
		
	
	}

}
