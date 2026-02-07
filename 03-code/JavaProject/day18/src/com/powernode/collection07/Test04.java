package com.powernode.collection07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.SequencedCollection;

public class Test04 {
    public static void main(String[] args) {
        SequencedCollection<Integer> sc = new ArrayList<>();
        sc.add(6);
        sc.add(7);
        sc.add(8);
        System.out.println(sc);//[6, 7, 8]
        sc.addFirst(5);
        System.out.println(sc);//[5, 6, 7, 8]
        sc.addLast(9);
        System.out.println(sc);//[5, 6, 7, 8,9]
        System.out.println("sc.getFirst() = " + sc.getFirst());//5
        System.out.println("sc.getLast() = " + sc.getLast());//9
        System.out.println("sc.removeFirst() = " + sc.removeFirst());//5 ,返回移除的第一个元素
        System.out.println("sc = " + sc);//[6, 7, 8, 9]
        System.out.println("sc.removeLast() = " + sc.removeLast());//9, 返回移除的最后一个元素
        System.out.println("sc = " + sc);//[6, 7, 8]
        System.out.println("sc.reversed() = " + sc.reversed());//[8, 7, 6]

    }
}
