package API.Endpoints;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import API.Payloads.Store;

public class StoreEndpoints {
	
	// Place Order (POST)
    public static Response placeOrder(Store payload) {

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
        .when()
                .post(Route.place_order);

        return response;
    }

    // Get Order (GET)
    public static Response getOrder(int orderId) {

        Response response = RestAssured.given()
                .pathParam("orderId", orderId)
        .when()
                .get(Route.get_order);

        return response;
    }

    // Delete Order (DELETE)
    public static Response deleteOrder(int orderId) {

        Response response = RestAssured.given()
                .pathParam("orderId", orderId)
        .when()
                .delete(Route.delete_order);

        return response;
    }

    // Check Inventory (GET)
    public static Response getInventory() {

        Response response = RestAssured.given()
        .when()
                .get(Route.inventory);

        return response;
    }

}
