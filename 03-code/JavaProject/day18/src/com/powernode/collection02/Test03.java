package com.powernode.collection02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("abc");
        list.add(true);
        //list存储的数据类型比较混乱，为后期数据处理带来了麻烦
        sum(list);

    }
    public static void sum(List list){
        int sum = 0;
        for (Object o : list) {
            if (o instanceof Integer) {
                Integer i = (Integer) o;
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
