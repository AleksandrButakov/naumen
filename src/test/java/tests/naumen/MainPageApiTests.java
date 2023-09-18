package tests.naumen;

import io.restassured.response.Response;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static helpers.CustomAllureListener.*;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPageApiTests {

    @Test
    @Tag("api")
    void checkMainPage() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/")
                        .then()
                        .log().status()
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkProducts() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/products/")
                        .then()
                        .log().status()
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkSupport() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/support/")
                        .then()
                        .log().status()
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkClients() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/clients/")
                        .then()
                        .log().status()
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkPartners() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/partners/")
                        .then()
                        .log().status()
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkCompany() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/company/")
                        .then()
                        .log().status()
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkNews() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/events/news/")
                        .then()
                        .log().status()
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkCareer() {
        Response response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/events/news/")
                        .then()
                        .log().status()
                        .statusCode(200)
                        .extract().response());

        step("Verification statusCode", () ->
                assertThat(response.statusCode()).isEqualTo(200));
    }

}
