package com.powernode.math08;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        //1.随机数获得方式一
        double random = Math.random();//[0.0-1.0)
        System.out.println(random);
        //2.获得[0,10]之间的随机数
        System.out.println(Math.round(Math.random() * 10));
        System.out.println("-----------");
        //3.获得随机数方式二
        Random random1 = new Random();
        //4.获得[0,10)之间的随机数
        System.out.println(random1.nextInt(10));

    }
}
