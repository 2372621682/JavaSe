package com.powernode.stream07;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc", "aaa", "bbb", "bb");
        //需求1：把流中的数据归集到ArrayList中
       /* ArrayList<String> collect = list.stream().collect(Collectors.toCollection(new Supplier<ArrayList<String>>() {

            @Override
            public ArrayList<String> get() {
                return new ArrayList<>();
            }
        }));*/
        ArrayList<String> arrayList = list.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("arrayList = " + arrayList);
        //需求2：把流中的数据归集到LinkedList中
        LinkedList<String> linkedList = list.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("linkedList = " + linkedList);
        //需求3：把流中的数据归集到HashSet中
        HashSet<String> hashSet = list.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println("hashSet = " + hashSet);
        //需求4：把流中的数据归集到TreeSet中
        TreeSet<String> treeSet = list.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);
    }
}
