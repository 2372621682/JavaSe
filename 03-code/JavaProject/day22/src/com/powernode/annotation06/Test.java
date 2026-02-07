package com.powernode.annotation06;

import java.util.List;

@interface MyAnnotation {
    // value属性，该属性是一个字符串数组
    String[] value();
}

public class Test {

    //@MyAnnotation(value = {"张三", "李四"})
    //@MyAnnotation({"张三", "李四"}) // value属性可以省略
    @MyAnnotation("张三") // 如果数组中只有一个元素，可以省略{}
    String name;

    @SuppressWarnings({"unused", "rawtypes"})
    List list;

}
