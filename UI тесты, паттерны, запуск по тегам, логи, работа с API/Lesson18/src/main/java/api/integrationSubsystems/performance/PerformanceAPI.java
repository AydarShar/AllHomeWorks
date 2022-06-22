package api.integrationSubsystems.performance;

import api.connection.Connection;
import io.restassured.response.Validatable;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;

import java.io.IOException;

public class PerformanceAPI {
    Connection connection;

    public Validatable getCars() {
        return connection.getSpecification().get("/cars");
    }

    public CloseableHttpResponse getHttpClientUsers() throws IOException {
        return connection.getClient().execute(null);
    }

    public PerformanceAPI setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }
}