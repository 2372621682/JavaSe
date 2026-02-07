package com.powernode.lambda06;

import com.powernode.lambda04.Function;

import java.util.Comparator;

public class Test04 implements Comparator<Integer> {

    /**
     * 1.函数式接口方法中第一个参数，作为内部方法的调用对象
     * 2.函数式接口方法从第二个参数开始，与内部方法的参数值一样
     * 3.返回类型兼容
     *
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
