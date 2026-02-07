package com.powernode.array06;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"a", "e", "c", "b", "d", "f"};
        Arrays.sort(strings);//[a, b, c, d, e, f]
        System.out.println(Arrays.toString(strings));
        /**
         * 现在需要降序
         *    1.String类实现了Comparable，String类具有了比较性
         *    2.String类的默认比较规则是【升序】
         *    3.我们需要降序，改变String类的比较规则，就需要用到Comparator
         *    4.sort的两个参数：
         *       1.T[] a ： 可以把T看出Object,需要排序的数组
         *       2.Comparator<? super T> c ：指定新的排序规则
         *
         */
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2);
                return o2.compareTo(o1);//降序
            }
        });
        System.out.println(Arrays.toString(strings));

    }
}
