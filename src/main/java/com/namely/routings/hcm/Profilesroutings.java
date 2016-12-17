package com.namely.routings.hcm;

/**
 * Created by anjalhussan on 11/18/16.
 */
public enum Profilesroutings {
    GET_PROFILES("/api/v1/profiles");


    private String route;

    Profilesroutings(final String route) {
        this.route=route;
    }
    public String getRoute(){
        return route;
    }
}
