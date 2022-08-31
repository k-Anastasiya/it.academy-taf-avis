package by.it.academy.anastasiya_karpovich.api.specifications;

import by.it.academi.anastasiya_karpovich.api.object.Token;
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
                .addHeader("Authorization", "Bearer " + "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJwem5vRHdsYlNUcmFwM2FTQzdSUUl3anpzb2NJWGlaTUQ2cUxBakh5X0NVIn0.eyJqdGkiOiI0Y2UwYTVmYS1jOGEyLTQyZTktYWVkMC05YjBhN2UzNGY5ODEiLCJleHAiOjE2NjE5NjIyODksIm5iZiI6MCwiaWF0IjoxNjYxOTU1MTQ5LCJpc3MiOiJodHRwczovL3Nzby1zc28uYXBwcy5hcGktbnAuYWJnYXBpc2VydmljZXMuY29tL2F1dGgvcmVhbG1zLzNzY2FsZS1zdGFnaW5nLWFwaS1vaWRjIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6ImQ3OTJiNWJkLWM1ODctNDE4Ny05YzUxLTVmMDYzODA0MzBkYSIsInR5cCI6IkJlYXJlciIsImF6cCI6IjY4NGJkMmYyIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiNjQ2MzU2M2ItYTliOS00NTBlLTg3ZmUtNWUxMDIyMTdhY2FjIiwiYWNyIjoiMSIsInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsImNsaWVudEhvc3QiOiIxOC4yMjUuMTIuMjE2IiwiY2xpZW50SWQiOiI2ODRiZDJmMiIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LTY4NGJkMmYyIiwiY2xpZW50QWRkcmVzcyI6IjE4LjIyNS4xMi4yMTYifQ.ElDCSTlvLXfDj58e8uoc6H82troCpZul97u6__GiSMycCef84bDekS2BtX9OJtKJzn8dfngzYJu2RiwqD8ISJKThG1eCourvJidOn7_zWB0S7dy_CuYe8ziyDogOq4pZ_exLLMvE-L_X5v2Ky9qgUvGTnNCMZxOLe8EMUq2MJo7DChwZEKN_th0oBjNJm0oc12XDfupjq9tyJi14OvXXZk6OSu0hleAM1WU_vcb_j7jaNQkMaOhzv7KthVb9ToOXeQvQ9Ss_Uha2B3yNTBE2WR3DS4cy5Cay6IlTwxlwA3LmdwtoFdItjxlUt86EBijT4icgD6iZuMNY0SlgocH0qQ")
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
