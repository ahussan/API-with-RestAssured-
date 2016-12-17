package com.namely.api;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import javax.json.JsonObject;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by anjalhussan on 11/1/16.
 */
public class PutAdapter implements RestAdapter{
    @Override
    public JsonPath execute(JsonObject object, String url, String method, String token) {
        Response response = given()
                .baseUri(url)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .relaxedHTTPSValidation()
                .auth().oauth2(token)
                .body(object.toString())
                .expect()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .log().ifError()
                .when()
                .put(method);
        String json = response.asString();
        return new JsonPath(json);
    }

    @Override
    public JsonPath execute(String url, String method, String token) {
        Response response = given()
                .baseUri(url)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .relaxedHTTPSValidation()
                .auth().oauth2(token)
                .expect()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .log().ifError()
                .when()
                .put(method);
        String json = response.asString();
        return new JsonPath(json);    }
}
