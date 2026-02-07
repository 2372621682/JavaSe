package com.powernode.exercise01;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 50; i++) {
            map.put(i, (int) Math.round(3.14 * i * i));
        }
        System.out.println(map);
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer key =  iterator.next();
            System.out.print("半径：" + key);
            System.out.println("\t面积：" + map.get(key));
        }
    }
}
