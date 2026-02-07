package com.powernode.collection12;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        /**
         * V put(K key, V value); 	指定key和value添加到集合中
         * V get(Object key)  	通过key获得value
         * Set<K> keySet() 	返回一个包含key值的set集合
         * Collection<V> values()	获得所有的value
         * V remove(Object key) 	通过指定的key删除元素，返回删除的value
         * boolean isEmpty() 	是否为空
         * void putAll(Map<? extends K, ? extends V> m) 	把m 添加到当前map中
         * boolean containsKey(Object key) 	是否包含指定的key
         * boolean containsValue(Object value)  是否包含指定的值	是否包含指定的值
         * Set<Map.Entry<K, V>> entrySet() 	 返回一个set集合
         * void clear()  	清空map
         * default V replace(K key, V value)	  替换指定key上的value值
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "aa");
        map.put(22, "bb");
        map.put(33, "cc");
        System.out.println("map = " + map);//{33=cc, 22=bb, 11=aa}
        System.out.println("map.get(22) = " + map.get(22));//bb

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println(map);//{33=cc, 22=bb, 11=aa}
        System.out.println(map.remove(22));//bb 返回删除的value
        System.out.println(map);//{33=cc, 11=aa}
        System.out.println(map.isEmpty());//false

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(22, "bb");
        map1.put(44, "cc");
        map.putAll(map1);
        System.out.println(map);//{33=cc, 22=bb, 11=aa, 44=cc}
        System.out.println(map.containsKey(22));//true
        System.out.println(map.containsValue("bb"));//true
        map.replace(44, "FF");
        System.out.println(map);//{33=cc, 22=bb, 11=aa, 44=FF}
        map.clear();
        System.out.println(map);//{}

    }
}
