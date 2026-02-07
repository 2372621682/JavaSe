package com.powernode.lambda04;

@FunctionalInterface
public interface Supplier<T> {
    //返回一个泛型参数类型
    T get();
}
