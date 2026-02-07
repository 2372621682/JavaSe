package com.powernode.exercise01;
class MyMath{
    public static int max(int x ,int y){
        return x > y ? x : y;
    }
    public static int min(int x ,int y){
        return x < y? x : y;
    }
}

public class Test06 {
    public static void main(String[] args) {
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2, 3));

    }
}
