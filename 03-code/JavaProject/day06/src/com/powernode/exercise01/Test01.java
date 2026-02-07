package com.powernode.exercise01;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("------while-------");
        int i = 0;
        while(i++ < 10){
            System.out.println("*****");
        }
        System.out.println("------do-while-------");
        int j = 0;
        do{
            System.out.println("*****");
        }while(j++ < 9);
        System.out.println("--------for---------");
        for (int k = 0; k < 10; k++) {
            System.out.println("*****");
        }
    }
}
