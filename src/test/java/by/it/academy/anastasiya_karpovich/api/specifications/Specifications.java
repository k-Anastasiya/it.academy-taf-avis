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
                .addHeader("Authorization", Token.getToken_type() + " " + Token.getAccess_token())
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
