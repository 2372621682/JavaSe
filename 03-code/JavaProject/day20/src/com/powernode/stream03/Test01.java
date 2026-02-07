package com.powernode.stream03;

import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(11, 22, 33, 11, 22, 44, 55);
        //去重
        stream.distinct().forEach(System.out::println);
    }
}
