package com.powernode.lambda06;

import com.powernode.lambda04.Consumer;

public class Test02 {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> consumer1 = System.out::println;


    }
}
