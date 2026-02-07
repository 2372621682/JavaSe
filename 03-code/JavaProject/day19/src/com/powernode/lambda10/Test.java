package com.powernode.lambda10;

import com.powernode.lambda04.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, int[]> function = new Function<>() {
            @Override
            public int[] apply(Integer length) {
                return new int[length];
            }
        };
        /**
         * 1. 语法规则：数据类型  [] ::new
         * 2. 满足条件
         *   1. 函数式接口中的方法只有一个整型参数
         *   2. 这个整型参数，正好是创建数组时指定的数组长度
         *   3. 返回类型兼容
         */
        Function<Integer, int[]> function1 = int []::new;
    }
}
