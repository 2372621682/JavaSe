package com.powernode.exercise01;

public class Test02 {
    public static void main(String[] args) {
        int i = 1;
        do{
            if (i % 13 == 0) {
                System.out.println("i = " + i);
            }
        }while(i ++ < 100);
    }
}
