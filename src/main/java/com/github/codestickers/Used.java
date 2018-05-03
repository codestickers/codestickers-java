package com.github.codestickers;

import java.lang.annotation.*;

/**
 * This annotations marks a section as used with an optional comment.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface Used {
    String value() default "";
}
