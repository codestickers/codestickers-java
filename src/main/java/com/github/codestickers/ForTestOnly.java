package com.github.codestickers;

/**
 * This annotations marks a program element that it exists
 * for testing purpose only. E.g. a main method.
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.PACKAGE})
@Documented
public @interface ForTestOnly
{
}
