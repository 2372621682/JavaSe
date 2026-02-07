package com.powernode.stream01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(60, 80, 30, 90, 50);
        //1.常规写法：求及格的分数
        for (Integer score : list) {
            if (score >= 60) {
                System.out.println(score);
            }
        }
        System.out.println("==============");
        //2.Stream流写法
        //2.1创建Stream流
        Stream<Integer> stream = list.stream();
        //2.2中间操作
        Stream<Integer> integerStream = stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer score) {
                return score >= 60;//把符合条件的保留下来
            }
        });
        //2.3终端操作
        integerStream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer score) {
                System.out.println(score);
            }
        });
        System.out.println("=============");
       /* stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        });*/  //.IllegalStateException  stream has already been operated upon or closed
        //2.2中间操作
        /*list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer score) {
                return score >= 60;//把符合条件的保留下来
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer score) {
                System.out.println(score);
            }
        });*/
        list.stream().filter( score -> score >= 60).forEach(System.out::println);
    }
}
