package com.powernode.collection08;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        /**
         * -- static <E> Set<E> copyOf(Collection<? extends E> coll) 	java10新增特性，静态方法，复制一个集合
         * -- static <E> Set<E> of(E e1....)	返回一个不可变的集合，如果添加删除等会报UnsupportedOperationException
         */
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);

        Set<Integer> set1 = Set.copyOf(set);//可以理解为只读集合
        System.out.println(set1);//[33, 22, 11]
        System.out.println(set == set1);//false 两块内存
        //set1.add(55);java.lang.UnsupportedOperationException 不支持的方法异常
        //set1.remove(22);java.lang.UnsupportedOperationException 不支持的方法异常


        Set<Integer> set2 = Set.of(1, 2, 3);
        //set2.add(4);java.lang.UnsupportedOperationException 不支持的方法异常
        //set2.remove(1);java.lang.UnsupportedOperationException 不支持的方法异常



    }
}
