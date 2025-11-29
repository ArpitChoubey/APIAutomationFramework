package JacksonAnnontationExample;

import java.util.ArrayList;
import java.util.HashMap;

import PojoClasses.Members;
import tools.jackson.databind.ObjectMapper;

public class Memberswithalldata {

	public static void main(String[] args) {


		Members M = new Members();
		M.setName("Pavan");
		M.setAddress("USA");
		M.setAge(90);
		M.setMarried(false);
		M.setMobileNo("23458755885");
		
		M.setSkillsets(new ArrayList<String>());
		M.setFamilytree(new HashMap<String,String>());
		
		ObjectMapper mapper = new ObjectMapper();
		String Jsonformat2 = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(M);
		System.out.println(Jsonformat2);

	}

}
