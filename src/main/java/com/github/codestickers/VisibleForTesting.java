package com.github.codestickers;

/**
 * This annotations marks a program element that it exists
 * or is visible for testing purpose only.
 * <p>
 * (Inspired by the guava annotation with the same name.)
 */

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface VisibleForTesting {
}
