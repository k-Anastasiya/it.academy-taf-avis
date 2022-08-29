package by.it.academy.anastasiya_karpovich.api.specifications;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Specifications {
    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri("https://stage.abgapiservices.com:443/cars/catalog")
                .setContentType(ContentType.JSON)
                .addHeader("client_id", "684bd2f2")
                .addHeader("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJwem5vRHdsYlNUcmFwM2FTQzdSUUl3anpzb2NJWGlaTUQ2cUxBakh5X0NVIn0.eyJqdGkiOiI0NGIxYzY3MS1kYjAzLTRjODMtOWZhYS04M2UzOTRhNTQwMmEiLCJleHAiOjE2NjE4MDUzNjEsIm5iZiI6MCwiaWF0IjoxNjYxNzk4MjIxLCJpc3MiOiJodHRwczovL3Nzby1zc28uYXBwcy5hcGktbnAuYWJnYXBpc2VydmljZXMuY29tL2F1dGgvcmVhbG1zLzNzY2FsZS1zdGFnaW5nLWFwaS1vaWRjIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6ImQ3OTJiNWJkLWM1ODctNDE4Ny05YzUxLTVmMDYzODA0MzBkYSIsInR5cCI6IkJlYXJlciIsImF6cCI6IjY4NGJkMmYyIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiOGU4ODNkY2YtNWU4Ni00N2RkLTlkYmUtYzBjMzAyN2M2ZGU3IiwiYWNyIjoiMSIsInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsImNsaWVudEhvc3QiOiIxOC4yMjUuMTIuMjE2IiwiY2xpZW50SWQiOiI2ODRiZDJmMiIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LTY4NGJkMmYyIiwiY2xpZW50QWRkcmVzcyI6IjE4LjIyNS4xMi4yMTYifQ.CupIn_87QRjy6Xz0PP11gP0pLD1ZWsPEZesTINSzbivXNUq_pOFm1cN2FnycKqE5G86ikdFxQxpGh8Y3cIQmVeHDBWKkg7GhFOD2QC8Bzv2GqmWhisk7aMOZ7Dt_cOHHCSikvTYRjcMpN3_AdS06iTKZ0cU6rAFRZooCwqAWQsrFkyOogxTmdX329dhebBsii8fgrv3auyWcTGrUwco8oMjGZ5rXhRv48m8HMyj9KN1oFE2Mkygo71DjWA4CopjQZj4X_ON4YDXJtDN9rxHb97d30vJtU5DayRRmfFKz0jAcExmO_S8yR6rjPT2WH1JDqmw6ochA_2KZf9iMqCfIeg")
                .build();
    }

    public static ResponseSpecification responseSpecificationOk(int i) {
        return new ResponseSpecBuilder()
                .expectStatusCode(i)
                .build();
    }

    public static void installSpecification(RequestSpecification request, ResponseSpecification response) {
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}
