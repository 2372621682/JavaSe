package com.powernode.stream05;

import java.io.Serializable;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(11, 22, 33);
        Stream<String> stream2 = Stream.of("aa", "bb", "cc");
        /**
         * <? extends Serializable> :向上限定
         *   Number implements java.io.Serializable
         *   String implements java.io.Serializable
         */
        Stream<? extends Serializable> concat = Stream.concat(stream1, stream2);
        concat.forEach(System.out::println);

    }
}
