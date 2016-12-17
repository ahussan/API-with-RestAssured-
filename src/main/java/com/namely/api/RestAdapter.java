package com.namely.api;

import com.jayway.restassured.path.json.JsonPath;

import javax.json.JsonObject;

/**
 * Created by anjalhussan on 11/1/16.
 */
public interface RestAdapter {
    JsonPath execute(JsonObject object, String url, String method, String token);

    JsonPath execute(String url, String method, String token);
}
