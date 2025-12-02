package API.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import API.Endpoints.UserEndPoints;
import API.Payloads.User;
import io.restassured.response.Response;
public class UserTests {
	
	Faker faker;
    User userPayload;
    
    public Logger logger;

    @BeforeClass
    public void setup()
    {
        faker = new Faker();
        userPayload = new User();

        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(faker.name().username());
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password(5, 10));
        userPayload.setPhone(faker.phoneNumber().cellPhone());
        
        logger = LogManager.getLogger(this.getClass());

}
    @Test(priority = 1)
    public void testPostUser() {
        logger.info("****************Creating User**************");
        Response response = UserEndPoints.createUser(userPayload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("****************Created User**************");
}
    @Test(priority=2)
    public void testGetUserByName() {
    	logger.info("****************Reading User Info**************");
        Response response = UserEndPoints.readUser(this.userPayload.getUsername());
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("****************Reading User Info done**************");
}
    @Test(priority = 3)
    public void testUpdateUserByName() {
        
        // Update some fields
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());

        Response response = UserEndPoints.UpdateUser(this.userPayload.getUsername(), userPayload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);

        // Get user again to verify update (optional, but good)
        Response responseAfterUpdate = UserEndPoints.readUser(this.userPayload.getUsername());
        responseAfterUpdate.then().log().all();
        Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
        logger.info("****************Updating User Info**************");
    }

    @Test(priority = 4)
    public void testDeleteUser() {

        Response response = UserEndPoints.DeleteUser(this.userPayload.getUsername());
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
        logger.info("****************Delete User **************");
    }
}