package tests.naumen;

import helpers.CustomAllureListener;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import models.lombok.ApiResponseLombokModel;
import models.lombok.LoginBodyLombokModel;
import models.pojo.LoginResponsePojoModel;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.v85.fetch.model.AuthChallengeResponse;

import static helpers.CustomAllureListener.*;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainPageApiTests {

    @Test
    @Tag("api")
    void checkMainPage() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkProducts() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/products/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkSupport() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/support/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkClients() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/clients/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkPartners() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/partners/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkCompany() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/company/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkNews() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/events/news/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

    @Test
    @Tag("api")
    void checkMainPageLinkCareer() {
        ApiResponseLombokModel response = step("Make get request", () ->
                given()
                        .filter(withCustomTemplates())
                        .log().uri()
                        .get("https://www.naumen.ru/events/news/")
                        .then()
                        .log().status()
                        .extract().as(ApiResponseLombokModel.class));

        step("Verify response", () ->
                AssertionsForClassTypes.assertThat(response.getStatusCode()).isEqualTo(200));
    }

}
