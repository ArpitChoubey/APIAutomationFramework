package JsonPathSession;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingDynamicResponseUsingInstanceof {

	public static void main(String[] args) {
		
		
		Response response = 
				RestAssured.get("https://mocki.io/v1/043b0517-a426-4c7a-baaa-02fc735c4f1f");
				Object responseAsObject = response.as(Object.class);
				if(responseAsObject instanceof List)
				{
					List responseAsList = (List)responseAsObject;
					System.out.println(responseAsList.size());
				}
				else if(responseAsObject instanceof Map)
				{
					Map responseAsMap = (Map)responseAsObject;
					System.out.println(((Map) responseAsObject).keySet());
				}

	}

}
