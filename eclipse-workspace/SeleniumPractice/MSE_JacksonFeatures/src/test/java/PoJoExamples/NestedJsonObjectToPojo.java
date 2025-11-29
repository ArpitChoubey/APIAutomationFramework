package PoJoExamples;

import io.restassured.RestAssured;

public class NestedJsonObjectToPojo {

	public static void main(String[] args) {
		
		
		Candidate Ab = RestAssured.get("https://mocki.io/v1/57a94431-63d3-49cf-bc8b-80d290e76ec0")
		.as(Candidate.class);

		 System.out.println(Ab.getFirstname());
		 System.out.println(Ab.getAddress().getStreet());
		 
		 //2nd Part directly Nested Json Object To Pojo
		 Location loc = RestAssured.get("https://mocki.io/v1/57a94431-63d3-49cf-bc8b-80d290e76ec0")
				 .jsonPath()
				 .getObject("address",Location.class);
		 
		 System.out.println(loc.getCountry());
	}

}
