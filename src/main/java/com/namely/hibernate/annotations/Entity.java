package com.namely.hibernate.annotations;

import com.namely.hibernate.enums.Schema;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Repeatable(Entities.class)
public @interface Entity {
    Class entity();

    Schema schema();

    int invocationCount() default 0;

    long[] ids() default {};
}
