package com.powernode.annotation11;

import java.lang.annotation.*;
@Documented// 使用 @Documented 注解，表示该注解被记录在文档中
@Retention(RetentionPolicy.RUNTIME)// 使用 @Retention 注解，表示该注解在运行时可以被获取
@Target(ElementType.TYPE)// 使用 @Target 注解，表示该注解可以被应用在类上
public @interface Table {
   String value();
}