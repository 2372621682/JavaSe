package com.powernode.annotation05;

@interface MyAnnotation {
     String value();
}
public class Test {
    //@MyAnnotation(value = "张三")
    //如果属性名为value，那么value可以省略，直接写值
    @MyAnnotation("张三")
    private String name;
}
