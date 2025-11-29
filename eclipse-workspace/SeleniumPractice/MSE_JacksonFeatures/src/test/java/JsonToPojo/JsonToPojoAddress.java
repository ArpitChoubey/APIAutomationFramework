package JsonToPojo;

import java.io.File;

import Pojo.Location;

import tools.jackson.databind.ObjectMapper;

public class JsonToPojoAddress {

	public static void main(String[] args) {

          ObjectMapper obj = new ObjectMapper();
 Location loc = obj.readValue(new File("C:\\Users\\hi\\eclipse-workspace\\SeleniumPractice\\MSE_JacksonFeatures\\src\\test\\java\\Payloads\\address.json"),Location.class);
           
 
            System.out.println(loc.getCity());
            
            loc.setCity("Sydeny");
            
        String updatedJson1 =    obj.writeValueAsString(loc);
 
        System.out.println(updatedJson1);
        
        String updatedJson2 = obj.writerWithDefaultPrettyPrinter().writeValueAsString(loc);
        
        System.out.println(updatedJson2);
	}
    
}
