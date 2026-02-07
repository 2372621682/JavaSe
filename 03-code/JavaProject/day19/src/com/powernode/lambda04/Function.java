package com.powernode.lambda04;

@FunctionalInterface
public interface Function<T, R> {
    //接收一个T类型的参数，返回一个R类型的结果
    R apply(T t);
}