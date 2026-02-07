package com.powernode.exercise01;

import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           li.add((int) Math.round(Math.random() * 100));
            //li.add(new Random().nextInt(100));
        }
        calcSum(li);

        List<Float> lf = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lf.add((float)Math.random() * 100);
        }
        calcSum(lf);

    }
    public static void calcSum(List<? extends Number> list){
        if (list.isEmpty())return;
        int isum = 0;
        float fsum = 0;
        Iterator<? extends Number> iterator = list.iterator();
        //判断集合中第一个元素是否为Integer类型（因为集合使用了泛型，第一个元素是什么类型，集合中所有数据都是什么类型）
        boolean flag = list.getFirst() instanceof Integer;
        while (iterator.hasNext()) {
            Number next = iterator.next();
            if (flag) {
                isum += (int)next;
            }else{
                fsum += (float)next;
            }
        }
        if (flag) {
            System.out.println("isum = " + isum);
        }else{
            System.out.println("fsum = " + fsum);
        }
    }
}
