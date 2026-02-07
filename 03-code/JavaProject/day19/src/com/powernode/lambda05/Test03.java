package com.powernode.lambda05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("word");
        list.add("java");
        //1.删除包含o的元素
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {//拿到集合中每个元素给s
                return s.contains("o");//返回true删除，返回false不删除
            }
        });
        //2.lambda
        list.removeIf((String s)-> {
                return s.contains("o");
        });
        //3.形参列表
        list.removeIf( s-> {
            return s.contains("o");
        });
        //4.方法体
        list.removeIf( s-> s.contains("o"));
        System.out.println(list);//[java]
    }
}
