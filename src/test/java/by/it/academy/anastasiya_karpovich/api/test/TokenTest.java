package by.it.academy.anastasiya_karpovich.api.test;

import by.it.academi.anastasiya_karpovich.api.object.Token;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TokenTest {
    @Test
    public void testGetToken(){
        given()
                .header("client_id","684bd2f2")
                .header("client_secret","156a2f0827ea19188abe11fa4af4763b")
                .when()
                .contentType(ContentType.JSON)
                .get("https://stage.abgapiservices.com/oauth/token/v1")
                .then().log().all()
                .extract().as(Token.class);
  }
}
