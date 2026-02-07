package com.powernode.lambda11;

import java.util.*;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        //1.遍历List
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        /*list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/
        list.forEach(System.out::println);//soutc
        //2.遍历Set
        Set<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.forEach(System.out::println);
        //3.遍历map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zs");
        map.put(2, "ls");
        map.put(3, "ww");
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key + ":" + value);
            }
        });
        // -- 判断是否可以使用方法引用，其次判断是否可以使用lambda表达式
        //1.lambda:(形参列表) ->{方法体}
        map.forEach((Integer key, String value) ->{
                System.out.println(key + ":" + value);
            }
        );
        //2.(形参列表)
        map.forEach(( key,  value) ->{
                    System.out.println(key + ":" + value);
                }
        );
        //3.{方法体}
        map.forEach(( key,  value) -> System.out.println(key + ":" + value));
    }
}
