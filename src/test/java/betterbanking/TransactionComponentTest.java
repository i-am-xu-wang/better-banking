package betterbanking;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.port;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

public class TransactionComponentTest {

    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get("transactions/{accountNumber}", port)
                .then()
                .statusCode(Matchers.is(200));
    }
}
