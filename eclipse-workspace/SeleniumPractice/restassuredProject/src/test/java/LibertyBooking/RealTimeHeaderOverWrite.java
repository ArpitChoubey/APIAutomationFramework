package LibertyBooking;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;

public class RealTimeHeaderOverWrite {
	
	@Test
	public void defaultbehavior() {
		
		RequestSpecification res1 = RestAssured
				.given()
		     .header("header1","value1");
		
		RequestSpecification res2 = RestAssured
				.given()
		      .header("header3", "value3")
		      .header("header1", "value1");
		      
		
		RestAssured
		.given()
		
		.config(RestAssuredConfig.config()
	            .headerConfig(HeaderConfig.headerConfig()
	                .overwriteHeadersWithName("header1","header2")))
		.spec(res1)
		.spec(res2)
		.log()
		.all()
		
		.given()
		.get();
		
	}

}
