package com.powernode.exercise01;

public class Test04 {
    public static void main(String[] args) {
        int x = 2, y = 3;
        int z = add(x, y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    public static int add(int x ,int y){
        x ++;
        y ++;
        int z = x + y;
        return z;
    }
}
