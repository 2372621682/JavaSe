package com.powernode.stream05;

import java.io.Serializable;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        Stream.of(11,22,33,44,55,66)
                .skip(2)//跳过前两个元素
                .limit(3)//截取前3个元素
                .forEach(System.out::println);//33,44,55

    }
}
