package com.github.codestickers;

import java.lang.annotation.*;

/**
 * Annotation to show that some logic
 * is just for the compiler to run without complaining
 */

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,
    ElementType.FIELD,
    ElementType.METHOD,
    ElementType.CONSTRUCTOR,
    ElementType.LOCAL_VARIABLE,
    ElementType.ANNOTATION_TYPE,
    ElementType.PACKAGE,
    ElementType.TYPE_PARAMETER,
    ElementType.TYPE_USE})
@Documented
public @interface KeepsTheCompilerHappy {
  String value() default "";
}

