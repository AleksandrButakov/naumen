package tests.naumen;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class MainPageApiTests {

    @Test
    @Tag("api")
    void checkMainPage() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/")
                .then()
                .log().status()
                .statusCode(200);
    }

    @Test
    @Tag("api")
    void checkMainPageLinkProducts() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/products/")
                .then()
                .log().status()
                .statusCode(200);
    }

    @Test
    @Tag("api")
    void checkMainPageLinkSupport() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/support/")
                .then()
                .log().status()
                .statusCode(200);
    }

    @Test
    @Tag("api")
    void checkMainPageLinkClients() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/clients/")
                .then()
                .log().status()
                .statusCode(200);
    }

    @Test
    @Tag("api")
    void checkMainPageLinkPartners() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/partners/")
                .then()
                .log().status()
                .statusCode(200);
    }

    @Test
    @Tag("api")
    void checkMainPageLinkCompany() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/company/")
                .then()
                .log().status()
                .statusCode(200);
    }

    @Test
    @Tag("api")
    void checkMainPageLinkNews() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/events/news/")
                .then()
                .log().status()
                .statusCode(200);
    }

    @Test
    @Tag("api")
    void checkMainPageLinkCareer() {
        given()
                .log().uri()
                .get("https://www.naumen.ru/career/")
                .then()
                .log().status()
                .statusCode(200);
    }

}
