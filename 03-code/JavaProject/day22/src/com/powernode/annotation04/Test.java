package com.powernode.annotation04;

/**
 * 1.修饰类的关键字是class,修饰注解的关键字是@interface
 * 2.注解也是一种数据类型，编译后也会生成单独的.class文件
 * 3.声明注解的语法：[修饰符] @interface 注解名称 {}
 */
@interface MyAnnotation01 {
   //注解的属性
    String name();
}
@interface MyAnnotation02 {
    //注解的属性
    int num() default 10;
}

public class Test {
    /**
     * - 使用注解时
     *   1.如果注解没有默认值
     *   2.添加注解的时候，必须指定属性值
     */
    @MyAnnotation01(name ="zs")
    String uname ;
    //如果添加了默认值，那么添加注解的时候可以不指定属性值
    @MyAnnotation02
    int age;

}
