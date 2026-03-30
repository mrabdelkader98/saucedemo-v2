package api;

import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserApiTest {
   /*@Test
    public void testGetSingleUser(){
        RestAssured.baseURI ="https://jsonplaceholder.typicode.com";

        given().header("Content-Type", "application/json")
                .header("User-Agent", "PostmanRuntime/7.37.0")
                .when().get("/user/1")
                .then().statusCode(200)
                .body("data.first_name", equalTo("Leanne Graham")).log().all();
    }*/
    @Test
    public void testGoogle(){
        RestAssured.baseURI="https://www.google.com";
        given().when().get().then().statusCode(200);
    }
}
