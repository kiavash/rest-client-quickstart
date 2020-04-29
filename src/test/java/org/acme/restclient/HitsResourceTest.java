package org.acme.restclient;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HitsResourceTest {

    @Test
    public void testCreateHitEndpoint() {
//        given()
//          .when().get("/callme/name/kiavash")
//          .then()
//             .statusCode(200);
    }

}
