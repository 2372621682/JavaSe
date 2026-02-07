package com.powernode.collection02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        Collection collection = new TreeSet();
        collection.add(5);
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        //java.lang.NullPointerException
        //TreeSet要排序，排序要比较，null存参与比较，所以报空指针异常
        collection.add(null);
        System.out.println(collection);
    }
}
