package com.powernode.exercise01;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 13 != 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
