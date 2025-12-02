package API.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import API.Endpoints.StoreEndpoints;
import API.Payloads.Store;
import io.restassured.response.Response;

public class StoreTests {
	
	Faker faker;
    Store storePayload;

    @BeforeClass
    public void setupData()
    {
        faker = new Faker();
        storePayload = new Store();

        storePayload.setId(faker.number().numberBetween(1, 999999));
        storePayload.setPetId(faker.number().numberBetween(1, 999999));
        storePayload.setQuantity(faker.number().numberBetween(1, 5));
        storePayload.setShipDate("2025-01-01T12:00:00.000Z");
        storePayload.setStatus("placed");
        storePayload.setComplete(true);
    }

    @Test(priority = 1)
    public void testPlaceOrder() {

        Response response = StoreEndpoints.placeOrder(storePayload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 2)
    public void testGetOrderById() {

        Response response = StoreEndpoints.getOrder(this.storePayload.getId());
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 3)
    public void testDeleteOrder() {

        Response response = StoreEndpoints.deleteOrder(this.storePayload.getId());
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 4)
    public void testGetInventory() {

        Response response = StoreEndpoints.getInventory();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

}
