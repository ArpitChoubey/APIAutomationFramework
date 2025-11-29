package PoJoExamples;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class CreateMultipleNestedJsonObjectUsingPojo {

	public static void main(String[] args) {
		
		
		Staff b = new Staff();
		b.setFirstname("Rakesh");
		b.setLastname("Sharma");
		b.setProfession("ICC President");
		
		Address A = new Address();
		A.setHouseNo(207);
		A.setStreet("Nagar Nigam Colony");
		A.setCity("Bangalore");
		A.setCountry("India");
		
		Address A1 = new Address();
		A1.setHouseNo(997);
		A1.setStreet("Nagar Shyam Colony");
		A1.setCity("New York");
		A1.setCountry("USA");
		
		List<Address> allAddress = new ArrayList<>();
		allAddress.add(A);
		allAddress.add(A1);
		
		b.setAddress(allAddress);
		
		
		
		
		RestAssured.given().log().all()
		  .body(b)
		  .post();

	}

}
