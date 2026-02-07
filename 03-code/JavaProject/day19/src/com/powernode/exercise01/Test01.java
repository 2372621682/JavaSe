package com.powernode.exercise01;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        String [] sArray = {"12","11","13","16","15"};
        Set<Integer> set = new TreeSet<>();
        for (String s : sArray) {
            int i = Integer.parseInt(s);//字符串转换为整数
            set.add(i);
        }
        System.out.println(set);
        System.out.println("===============");
        Iterator<Integer> iterator = set.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            sum += next;
        }
        System.out.println("sum = " + sum);
    }
}
