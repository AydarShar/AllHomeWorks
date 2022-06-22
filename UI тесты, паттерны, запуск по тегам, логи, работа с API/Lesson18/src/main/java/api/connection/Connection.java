package api.connection;

import io.restassured.specification.RequestSpecification;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

public interface Connection {
    CloseableHttpClient getClient(); // Apache HttpClient5
    RequestSpecification getSpecification(); // RestAssured
}