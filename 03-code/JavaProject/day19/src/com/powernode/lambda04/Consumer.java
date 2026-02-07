package com.powernode.lambda04;

@FunctionalInterface
public interface Consumer<T> {
    /**
     * 1. T 通过泛型参数来约束参数类型
     * 2. accept(T t)，处理一个T类型的参数，不返回结果
     *    比如：打印t
     */
    void accept(T t);
}


@FunctionalInterface
interface Comparator<T> {
    /**
     * 1.T 通过泛型参数来约束参数类型
     * 2.compare(T o1, T o2)：编写比较规则
     *    1. o1 > o2 返回正数
     *    2. o1 < o2 返回负数
     *    3. o1 = o2 返回0
     */
    int compare(T o1, T o2);
}