package com.powernode.stream02;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        //需求1：筛选出名称长度大于2的字符串
        Stream<String> stream = Stream.of("张三丰", "赵敏", "周芷若", "张无忌", "谢逊", "杨过");
        /*stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.length() > 2;
            }
        }).forEach(System.out::println);*/
        stream.filter( name -> name.length() > 2).forEach(System.out::println);
    }
}
