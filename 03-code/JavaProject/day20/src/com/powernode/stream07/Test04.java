package com.powernode.stream07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("aa", "bb", "cc");
       /* String[] array = stream.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int length) {
                return new String[length];
            }
        });*/
        String[] array = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(array));

    }
}
