package com.powernode.lambda04;

@FunctionalInterface
public interface Predicate<T> {
    //判断一个元素是否满足某些条件，满足返回ture,否则返回false
    boolean test(T t);
}