package com.powernode.annotation11;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)// 表示该注解可以被应用在字段上
public @interface Column {
    String value();
}