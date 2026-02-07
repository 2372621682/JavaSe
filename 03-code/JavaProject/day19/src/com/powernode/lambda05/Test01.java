package com.powernode.lambda05;

import com.powernode.lambda04.Consumer;

import java.io.PrintStream;

public class Test01 {
    public static void main(String[] args) {
        //-匿名内部类
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        //1.使用lambda表达式：(形参类别)->{方法体}
        Consumer<String> consumer1 = (String s) ->{
                System.out.println(s);
        };
        /**
         * 2.形参列表
         *    1.参数类型可以省略
         *    2.只有一个参数()可以省略
         */
        Consumer<String> consumer2 =  s ->{
            System.out.println(s);
        };
        //3.方法体：当方法体只有一条语句时，return，{}和分号 可以省略
        Consumer<String> consumer3 =  s -> System.out.println(s);
        /**
         * 4.方法引用（实例方法）
         *   1.语法格式：对象::方法名称
         *   2.满足条件
         *      函数式接口中方法     【返回类型】   和【参数】
         *      与
         *      内部方法             【返回类型】   和【参数】
         *      返回类型兼容，参数值一样
         */
        Consumer<String> consumer4 = new Consumer<>() {
            @Override
            public void accept(String s) {
                /*System.out.println(s);*/
                PrintStream out = System.out;
                out.println(s);
            }
        };
        Consumer<String> consumer5 = System.out::println;
    }
}
