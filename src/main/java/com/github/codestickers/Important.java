package com.github.codestickers;

import java.lang.annotation.*;

/**
 * This annotation contains related information.
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
@Repeatable(Importants.class)
public @interface Important {
    String value() default "";
}
