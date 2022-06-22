package homeWork;

import api.integrationSubsystems.performance.models.Cars;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

//
public class RestTest2 {
    @Test
    @DisplayName("2-ой (упрощенный) вариант Рест запроса GET для получения машин")
    @Tag("cars")
    void getCarsTest() {
        List<Cars> cars = given()
                .baseUri("http://77.50.236.203:4880")
                .basePath("/cars")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then().log().all()
                .statusCode(200).extract().jsonPath().getList("", Cars.class);
    }
}
