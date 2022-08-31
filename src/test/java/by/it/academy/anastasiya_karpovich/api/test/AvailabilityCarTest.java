package by.it.academy.anastasiya_karpovich.api.test;

import by.it.academi.anastasiya_karpovich.api.object.Token;
import by.it.academy.anastasiya_karpovich.api.specifications.Specifications;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class AvailabilityCarTest {
    @Test
    public void testGetListOfAvailabilityCar()  {
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecificationOk(200));

        given()
                .queryParam("brand", "Avis")
                .queryParam("country_code", "US")
                .queryParam("dropoff_date", "2022-12-31T00:00:00")
                .queryParam("dropoff_location", "BOS")
                .queryParam("pickup_date", "2022-12-30T00:00:00")
                .queryParam("pickup_location", "EWR")
                .queryParam("rate_code", "A3")
                .queryParam("vehicle_class_code", "A")

                .when()
                .get("/v1/vehicles")

                .then().log().all()
                .body("vehicles.category", notNullValue())
                .body("vehicles.features", notNullValue())
                .body("vehicles.capacity", notNullValue())
                .body("vehicles.rate_totals", notNullValue())
                .body("vehicles.pay_later", notNullValue());
    }
}

