package com.namely.api;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

/**
 * Created by anjalhussan on 11/8/16.
 */
public enum Factory {


    GET(GetAdapter::new),
    POST(PostAdapter::new),
    PUT(PutAdapter::new),
    DELETE(DeleteAdapter::new);

    public final RestAdapter method;

    Factory(Supplier<RestAdapter> method) {
        this.method = requireNonNull(method).get();
    }
}
