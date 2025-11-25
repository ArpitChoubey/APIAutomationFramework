package LibertyBooking;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;

public class DefaultHeaderBehaviour {
	
	@Test
	public void defaultbehavior() {
		
		RestAssured
		.given()
		.log()
		.all()
		.header("header1", "value1","value2","value3","value6")
		.when()
		.get();
		
	}
	
	@Test
	public void overwriteHeaderValue() {
		
	    RestAssured
        .given()
        .config(RestAssuredConfig.config()
            .headerConfig(HeaderConfig.headerConfig()
                .overwriteHeadersWithName("header1","header2")))
        .config(RestAssuredConfig.config()
                .headerConfig(HeaderConfig.headerConfig()
                		.mergeHeadersWithName("header1")))
        .header("header1", "value1")
        .header("header11", "value5")
        .header("header12", "value17")
        .header("header13", "value18") // Accept Headers  and content type Headers will never merged 
           .log()
           .all()
           .when()
   		.get();
	}
	

}
