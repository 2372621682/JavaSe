package com.powernode.exercise01;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args) {
        String [] sArray = {"12","11","13","16","15"};
        Set<Integer> set = new TreeSet<>();
        for (String s : sArray) {
            int i = Integer.parseInt(s);//字符串转换为整数
            set.add(i);
        }
        System.out.println(set);
        System.out.println("===============");
        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }
        System.out.println("sum = " + sum);
    }
}
