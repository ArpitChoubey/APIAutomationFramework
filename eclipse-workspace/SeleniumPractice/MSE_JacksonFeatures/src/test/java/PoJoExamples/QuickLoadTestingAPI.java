package PoJoExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class QuickLoadTestingAPI {

	public static void main(String[] args) throws Throwable {
		
		ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i < 500; i++) {
            int requestId = i;

            executorService.submit(() -> {
                Response response = RestAssured
                        .get("https://dummyjson.com/test")
                        .then()
                        .extract()
                        .response();

                System.out.println("Request " + requestId + " : " + response.getStatusCode());
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.SECONDS);
	}

}
