package com.myapp.v3;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class StudentTest {

    @Test
    public void shouldcountAllStudents() {
        given().header(HttpHeaders.ACCEPT, MediaType.TEXT_PLAIN).when().get("/resource/count").then().body(is("3")).statusCode(200);

    }

}