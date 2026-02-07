package com.powernode.collection02;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        List list = new ArrayList();//有序可重复
        //把数据放入集合
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(11);//可重复
        list.add(null);
        list.add(null);
        System.out.println(list);//[11, 21, 31, 41]

        Set set = new HashSet();//无序不可重复
        set.add(11);
        set.add(21);
        set.add(31);
        set.add(41);
        set.add(11);//不可重复
        set.add(null);
        set.add(null);
        System.out.println(set);//[21, 41, 11, 31]

    }
}
