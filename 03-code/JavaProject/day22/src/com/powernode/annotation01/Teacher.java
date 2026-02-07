package com.powernode.annotation01;

/**
 * - 自定义注解
 *   1.修饰类的关键字是class,修饰注解的关键字是@interface
 *   2.注解也是一种数据类型，编译后也会生成单独的class文件
 *   3.声明注解的语法：
 *      [修饰符] @interface 注解名称{
 *
 *      }
 */
@interface MyAnnotation{

}
@MyAnnotation
public class Teacher {
    @MyAnnotation
    private String name;

    @MyAnnotation
    public Teacher(@MyAnnotation String name) {
        this.name = name;
    }
    @MyAnnotation
    public String getName() {
        return name;
    }
    @MyAnnotation
    public void setName(String name) {
        this.name = name;
    }
}
