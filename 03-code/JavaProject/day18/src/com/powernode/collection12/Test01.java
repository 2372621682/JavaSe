package com.powernode.collection12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        /**
         *  HashMap，Hashtable和TreeMap的区别
         *    1.HashMap
         *        1.非线程安全，效率比较高
         *        2.允许null值和null键，但是null键只能存储一个
         *        3.底层数据结构为hash表
         *        4.key相同会覆盖value
         *    2.Hashtable
         *        1.线程安全的，效率比较低
         *        2.不允许null值和null键
         *        3.底层数据结构为哈希表
         *    3.TreeMap
         *       1.可以按照key的自然顺序排序
         *       2.不允许出现null作为key，但是允许value为null
         *       3.底层数据结构是二叉树
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1001, "zs");
        map.put(1001, "ls");//key相同会覆盖value
        System.out.println(map);//{1001=ls}
        map.put(null, null);
        System.out.println(map);
        map.put(null, "ww");
        System.out.println(map);
        System.out.println("-------Hashtable--------");
        Map<Integer, String> map1 = new Hashtable<>();
        //map1.put(null, "zs");NullPointerException
        //map1.put(1001, null);NullPointerException
        System.out.println("-------TreeMap--------");
        Map<Integer, String> map2 = new TreeMap<>();
        //map2.put(null, "zs");NullPointerException
        map2.put(1001, null);
        map2.put(1001, "zs");
        map2.put(1000, "zs");
        map2.put(1002, "zs");

        System.out.println(map2);

    }
}
