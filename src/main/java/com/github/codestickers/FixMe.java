package com.github.codestickers;

import java.lang.annotation.*;

/**
 * This annotations marks a fix me.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.CONSTRUCTOR,
        ElementType.LOCAL_VARIABLE,
        ElementType.ANNOTATION_TYPE,
        ElementType.PACKAGE,
        ElementType.TYPE_PARAMETER,
        ElementType.TYPE_USE})
@Documented
public @interface FixMe {
    String value() default "";
}
