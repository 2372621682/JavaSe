package com.powernode.annotation03;

/**
 * 1.函数式接口，使用@FunctionalInterface注解修饰
 * 2.函数式接口中只有一个抽象方法
 * 3.函数式接口可以有默认方法，静态方法和私有方法
 */
@FunctionalInterface
public interface Flyer {
    void fly();
    //函数式接口可以有默认方法，静态方法和私有方法
    default void swim() {}
    static void show() {}
    private void show2() {}
}