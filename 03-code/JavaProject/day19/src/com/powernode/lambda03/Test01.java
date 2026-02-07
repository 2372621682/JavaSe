package com.powernode.lambda03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //创建一个包含整数元素的list集合，使用Arrays.asList直接创建（不支持添加和删除，支持修改）
        List<Integer> list = Arrays.asList(3, 1, 2, 5, 4);
        //需求1：想对集合中元素进行升序排序
       /* list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/
        list.sort(Integer::compareTo);
        System.out.println(list);
    }
}
