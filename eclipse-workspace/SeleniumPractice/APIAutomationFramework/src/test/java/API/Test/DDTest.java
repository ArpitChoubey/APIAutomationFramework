package API.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import API.Endpoints.UserEndPoints;
import API.Payloads.User;
import API.Utilities.DataProviders;
import io.restassured.response.Response;

public class DDTest {

	
	 @Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
	    public void testPostUser(String userID, String userName, String fname,
	                             String lname, String useremail, String pwd, String phone) {

	        User userPayload = new User();

	        userPayload.setId(Integer.parseInt(userID));
	        userPayload.setUsername(userName);
	        userPayload.setFirstName(fname);
	        userPayload.setLastName(lname);
	        userPayload.setEmail(useremail);
	        userPayload.setPassword(pwd);
	        userPayload.setPhone(phone);

	        Response response = UserEndPoints.createUser(userPayload);

	        Assert.assertEquals(response.getStatusCode(), 200);
	    }
	 
	 @Test(priority = 2, dataProvider = "UserNames", dataProviderClass = DataProviders.class)
	 public void testDeleteUserByName(String userName)
	 {
	     Response response = UserEndPoints.DeleteUser(userName);
	     Assert.assertEquals(response.getStatusCode(), 200);
	 }
}
