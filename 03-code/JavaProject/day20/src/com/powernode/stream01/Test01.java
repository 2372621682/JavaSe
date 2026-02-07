package com.powernode.stream01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        //1.通过集合创建Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        //2.通过数组创建Stream流
        String[] str = {"aa", "bb", "cc"};
        Stream<String> stream1 = Arrays.stream(str);
        //3.通过静态方法创建Stream流
        Stream<String> aa = Stream.of("aa", "bb", "cc");
    }
}
