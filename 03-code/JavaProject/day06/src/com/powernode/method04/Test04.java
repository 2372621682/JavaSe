package com.powernode.method04;

public class Test04 {
    public static void main(String[] args) {
       int x = 2, y = 3;
        System.out.println("x = " + x);//2
        System.out.println("y = " + y);//3
        int z = changeInt(x, y);
        System.out.println("x = " + x);//2
        System.out.println("y = " + y);//3
        System.out.println("z = " + z);//7
    }

    public static int changeInt(int x, int y) {
        x ++;
        y ++;
        int z = x + y;
        System.out.println("x = " + x);//3
        System.out.println("y = " + y);//4
        System.out.println("z = " + z);//7
        return z;
    }


}
