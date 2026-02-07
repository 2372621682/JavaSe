package com.powernode.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        //将多个集合中的元素映射到一个流中
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
        //把流中集合取出放入流中（上面的流放的是集合，我们要放Integer对象）
      /*  Stream<Integer> integerStream = stream.flatMap(new Function<List<Integer>, Stream<Integer>>() {
            @Override
            public Stream<Integer> apply(List<Integer> integers) {
                return integers.stream();
            }
        });
        integerStream.forEach(System.out::println);*/
       /* stream.flatMap(new Function<List<Integer>, Stream<Integer>>() {
            @Override
            public Stream<Integer> apply(List<Integer> integers) {
                return integers.stream();
            }
        }).forEach(System.out::println);*/
        stream.flatMap(List<Integer>::stream).forEach(System.out::println);

    }
}
