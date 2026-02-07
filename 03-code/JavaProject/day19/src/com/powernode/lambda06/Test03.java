package com.powernode.lambda06;

import com.powernode.lambda04.Function;

public class Test03 {
    public static void main(String[] args) {
        //蒋一个字符串转换为Integer类型
        Function<String, Integer> function = new Function<>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        /**
         * 函数式接口中方法    【返回类型】  和 【参数】
         * 与
         * 内部方法           【返回类型】  和 【参数】
         *     返回类兼容，参数值一样
         */
        Function<String, Integer> function1 = Integer::parseInt;
        Integer num = function1.apply("123");
        System.out.println(num);
    }
}
