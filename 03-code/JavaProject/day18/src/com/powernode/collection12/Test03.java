package com.powernode.collection12;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "aa");
        map.put(22, "bb");
        map.put(33, "cc");
        System.out.println(map);//{33=cc, 22=bb, 11=aa}
        //Entry 是 Map的内部接口
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
