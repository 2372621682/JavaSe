package com.powernode.stream01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        //1.创建一个顺序流
        Stream<String> stream = Stream.of("aa", "bb", "cc");
        //2.判断当前流是否为并行流
        System.out.println("stream.isParallel() = " + stream.isParallel());
        //3.把顺序流转换为并行流
        Stream<String> parallel = stream.parallel();
        System.out.println("parallel.isParallel() = " + parallel.isParallel());
        //4.把并行流转换为顺序流
        Stream<String> sequential = parallel.sequential();
        System.out.println("sequential.isParallel() = " + sequential.isParallel());

        //5.直接创建并行流
        List<String> list = Arrays.asList("aa", "bb", "cc");
        Stream<String> stream1 = list.parallelStream();
        System.out.println("stream1.isParallel() = " + stream1.isParallel());


    }
}
