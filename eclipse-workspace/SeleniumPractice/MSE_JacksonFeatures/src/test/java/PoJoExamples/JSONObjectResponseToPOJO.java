package PoJoExamples;

import io.restassured.RestAssured;

public class JSONObjectResponseToPOJO {

	

	public static void main(String[] args) {
		
		
		Associate associate = 
				RestAssured.get("https://mocki.io/v1/ef49ed57-51ab-42e0-91fb-02489c04a5a5")
				.as(Associate.class);
		
		int Age =associate.getAge();
		System.out.println(Age);

	}

}
