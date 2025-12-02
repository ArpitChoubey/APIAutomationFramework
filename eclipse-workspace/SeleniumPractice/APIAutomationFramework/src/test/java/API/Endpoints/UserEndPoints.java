package API.Endpoints;

import API.Payloads.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {
	
	public static Response createUser(User payload) {

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
        .when()
                .post(Route.post_url);

        return response;
    }


    public static Response readUser(String userName) {

        Response response = RestAssured.given()
                .pathParam("username", userName)
        .when()
                .get(Route.get_url);

        return response;

}
    public static Response UpdateUser(String userName,User payload) {

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username", userName)
                .body(payload)
        .when()
                .put(Route.update_url);

        return response;
    }
    
    public static Response DeleteUser(String userName) {

        Response response = RestAssured.given()
                .pathParam("username", userName)
        .when()
                .delete(Route.delete_url);

        return response;

}

}
