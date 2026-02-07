package com.powernode.lambda03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        //创建一个包含整数元素的list集合，使用Arrays.asList直接创建（不支持添加和删除，支持修改）
        List<Integer> list = Arrays.asList(3, 1, 2, 5, 4);
        //需求1：对集合中元素进行排序
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list);
        /**
         * 1.发现Comparator 是一个函数式接口，可以使用Lambda表达式
         * 2.Lambda表达式语法：
         *    1.把【函数式接口的参数列表】  和 【方法体】 使用 -> 连接起来
         *    2.语法：(形参列表) -> {方法体} ：函数式接口的抽象方法
         *    3.可以把Lambda表达式看成一个匿名方法
         */
        list.sort((Integer o1, Integer o2) ->{
                return o1 - o2;
            }
        );
        System.out.println(list);
        /**
         * 优化1：
         *    1.参数类型可以省略（会根据上下文推断出参数类型）
         *    2.当参数列表只有一个参数时（）可以省略
         */
        list.sort(( o1,  o2) ->{
                    return o1 - o2;
                }
        );
        System.out.println(list);
        //优化2：当方法体只有一条语句时，return，{}和分号 可以省略
        list.sort(( o1,  o2) -> o1 - o2);
        System.out.println(list);
        //优化3：方法方法引用，后面专题讲，提前体验一下
        list.sort(Integer::compareTo);
        System.out.println(list);

    }
}
