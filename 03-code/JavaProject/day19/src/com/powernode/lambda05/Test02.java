package com.powernode.lambda05;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test02 {
    public static void main(String[] args) {
        //-匿名内部类
       /* Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
       consumer.accept("hello");*/
        //System.out.println("hello");
        List<String> list = Arrays.asList("Hello", "Word", "Java");
        //1.传统写法遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("----------");
        //2.使用forEach
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //3.lambda :(形参列表)->{方法体}
        list.forEach((String s) ->{
                System.out.println(s);
        });
        //4.(形参列表) ：参数类型可以省略，只有一个参数()可以省略
        list.forEach( s ->{
            System.out.println(s);
        });
        //5. {方法体} :只有一条语句时，return ,{}和;可以省略
        list.forEach( s -> System.out.println(s));
        //6.方法引用：
        list.forEach(System.out::println);
    }
}
