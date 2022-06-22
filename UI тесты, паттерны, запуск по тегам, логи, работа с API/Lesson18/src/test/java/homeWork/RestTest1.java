package homeWork;

import api.connection.RestAssuredConnection;
import api.integrationSubsystems.performance.PerformanceAPI;
import api.integrationSubsystems.performance.models.Cars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Type;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestTest1 {
    PerformanceAPI performanceAPI = new PerformanceAPI();

    @Test
    @DisplayName("Рест запрос GET для получения массива из пользователей")
    @Tag("cars")
    void getUsersTest() {

        Cars[] cars = performanceAPI.setConnection(new RestAssuredConnection())
                .getCars()
                .then().log().all()
                .statusCode(200)
                .extract()
                .response()
                .getBody()
                .as((Type) Cars[].class);

        step("Приверка : массив из Users не пустой", () -> {assertNotNull(cars);});

        step("Поверка : массив Users имеет что-то в себе  ");
        assertTrue(cars.length > 0);
    }

    @Test
    @Tag("cars")
    void getUsersHttpClientTest() throws IOException {
        PerformanceAPI performanceAPI = new PerformanceAPI();
                //.setConnection(new HttpClientConnection());

        performanceAPI.getHttpClientUsers();

    }
}
