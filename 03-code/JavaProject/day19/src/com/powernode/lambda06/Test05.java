package com.powernode.lambda06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 0, 3, 4, 5);
       /* list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });*/
        //类名称::方法名称
        list.sort(Integer::compareTo);
        System.out.println(list);
    }


}
