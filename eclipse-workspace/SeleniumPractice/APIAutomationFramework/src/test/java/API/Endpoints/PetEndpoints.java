package API.Endpoints;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import API.Payloads.Pet;
public class PetEndpoints {
	
	// Add Pet (POST)
    public static Response addPet(Pet payload) {

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
        .when()
                .post(Route.add_pet);

        return response;
    }

    // Get Pet (GET)
    public static Response getPet(int petId) {

        Response response = RestAssured.given()
                .pathParam("petId", petId)
        .when()
                .get(Route.get_pet);

        return response;
    }

    // Update Pet (PUT)
    public static Response updatePet(Pet payload) {

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
        .when()
                .put(Route.update_pet);

        return response;
    }

    // Delete Pet (DELETE)
    public static Response deletePet(int petId) {

        Response response = RestAssured.given()
                .pathParam("petId", petId)
        .when()
                .delete(Route.delete_pet);

        return response;
    }

}
