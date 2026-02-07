package com.powernode.collection02;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        /**
         * 1. <Integer>约束了list集合只能存储Integer对象
         * 2. 存储其他数据类型的对象，报错
         */
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
       /* list.add("abc");
        list.add(true);*/
        //list存储的数据类型比较混乱，为后期数据处理带来了麻烦
        sum(list);

    }
    //使用泛型，可以解决不必要的数据类型强制转换
    public static void sum(List<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        /*for (Object o : list) {
            if (o instanceof Integer) {
                Integer i = (Integer) o;
                sum += i;
            }
        }*/
        System.out.println(sum);
    }
}
