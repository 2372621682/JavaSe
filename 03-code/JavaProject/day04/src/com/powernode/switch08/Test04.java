package com.powernode.switch08;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        char c = 'b';
        switch (c){
            case 'a' -> System.out.println('a');
            case 'b' -> System.out.println('b');
            case 'c' -> System.out.println('c');
            default -> System.out.println("非法字符");
        }
    }
}
