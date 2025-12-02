package API.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import API.Endpoints.PetEndpoints;
import API.Payloads.Pet;
import io.restassured.response.Response;

public class PetTest {
	
	Faker faker;
    Pet petPayload;

    @BeforeClass
    public void setupData()
    {
        faker = new Faker();
        petPayload = new Pet();

        petPayload.setCode(faker.number().numberBetween(1, 999999));
        petPayload.setMessage(faker.animal().name());
        petPayload.setType("available");
    }

    @Test(priority = 1)
    public void testAddPet() {

        Response response = PetEndpoints.addPet(petPayload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 2)
    public void testGetPetById() {

        Response response = PetEndpoints.getPet(this.petPayload.getCode());
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 3)
    public void testUpdatePet() {

        // Update some fields
        petPayload.setMessage(faker.pokemon().name());
        petPayload.setCode(32222);

        Response response = PetEndpoints.updatePet(petPayload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);

        // Verify updated pet
        Response responseAfterUpdate = PetEndpoints.getPet(this.petPayload.getCode());
        responseAfterUpdate.then().log().all();
        Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
    }

    @Test(priority = 4)
    public void testDeletePet() {

        Response response = PetEndpoints.deletePet(this.petPayload.getCode());
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

}
