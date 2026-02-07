package com.powernode.stream07;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc", "aaa", "bbb", "ee");
        Stream<String> stream = list.stream();
        //需求1：把流中的数据归集到List中
        //List<String> collect = stream.collect(Collectors.toList());
        List<String> collect = stream.toList();

        //需求2：把流中的数据归集到Set中
        Set<String> collect1 = list.stream().collect(Collectors.toSet());
        Set<String> set = new HashSet<>(list);

        //需求3：把流中的数据归集到Map中
        List<String> list1 = Arrays.asList("张三:北京", "李四:南京", "王五:上海");
        /*Map<String, String> collect2 = list1.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.substring(0, s.indexOf(":"));//截取key
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.substring(s.indexOf(":") + 1);
            }
        }));*/
        Map<String, String> collect2 = list1.stream().collect(Collectors.
                toMap( s-> s.substring(0, s.indexOf(":"))
        ,  s -> s.substring(s.indexOf(":") + 1)));
        System.out.println("collect2 = " + collect2);

    }
}
