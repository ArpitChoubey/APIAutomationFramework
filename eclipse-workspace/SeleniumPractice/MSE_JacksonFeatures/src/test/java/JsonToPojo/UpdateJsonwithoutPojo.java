package JsonToPojo;

import java.io.File;
import java.util.Map;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class UpdateJsonwithoutPojo {

	public static void main(String[] args) {
		
		
		ObjectMapper obj = new ObjectMapper();
		 Map<String,Object> loc = obj.readValue(new File("C:\\Users\\hi\\eclipse-workspace\\SeleniumPractice\\MSE_JacksonFeatures\\src\\test\\java\\Payloads\\address.json"),
				 new TypeReference<Map<String,Object>>(){});
		           
		 
		            System.out.println(loc.get("city"));
		            
		            loc.put("city", "Delhi");
		            loc.put("pin", "230089");
		            loc.remove("streetName");
		            
		            String updated = obj.writerWithDefaultPrettyPrinter().writeValueAsString(loc);
		            
		            System.out.println(updated);
		            

	}

}
