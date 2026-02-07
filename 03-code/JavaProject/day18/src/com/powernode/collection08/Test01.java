package com.powernode.collection08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Test01 {
    public static void main(String[] args) {
        /**
         * void add(int index, E element)	在当前集合中index处插入element元素
         * boolean addAll(int index, Collection<? extends E> c) 	将c集合中的所有元素插入到指定位置
         * E get(int index)	返回index位置的元素。
         * int indexOf(Object o)	返回o在当前集合中的第一次出现的索引，-如果不包含o元素，返回- 1
         * int lastIndexOf(Object o)	返回o在当前集合中的索引，-如果包含o元素，返回- 1。
         * default E getFirst()	返回第一个元素
         * ListIterator<E> listIterator()	返回列表元素的列表迭代器。
         * ListIterator<E> listIterator(int index)	 从当前集合中指定[index,最后) 返回一个迭代器。
         * E set(int index, E element) 	指定index位置，替换为element元素
         * sort(Comparator<? super E> c)
         * 分类列表使用提供的 Comparator比较元素。
         * List<E> subList(int fromIndex, int toIndex)	截取当前List中从[fromIndex,toIndex)的子集，返回一个List对象
         * -- static <E> Set<E> copyOf(Collection<? extends E> coll) 	java10新增特性，静态方法，复制一个集合
         * -- static <E> Set<E> of(E e1....)	返回一个不可变的集合，如果添加删除等会报UnsupportedOperationException
         */
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(1, 22);//[11, 22]
        System.out.println("list1 = " + list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(33);
        list2.add(44);
        list2.add(55);
        list1.addAll(2,list2);
        System.out.println("list1 = " + list1);//[11, 22, 33, 44, 55]

        System.out.println("list1.get(0) = " + list1.get(0));//11
        System.out.println("list1.indexOf(33) = " + list1.indexOf(33));//2
        System.out.println("list1.lastIndexOf(33) = " + list1.lastIndexOf(33));//2
        //通过list1拿到list专用迭代器，可以从前往后迭代，也可以从后往前迭代
        ListIterator<Integer> integerListIterator = list1.listIterator();
        System.out.println("------------------从前往后迭代----------------------");
        while(integerListIterator.hasNext()){
            System.out.println("返回元素的索引：" + integerListIterator.nextIndex());
            System.out.println("返回元素：" + integerListIterator.next());
        }
        System.out.println("------------------从后往前迭代----------------------");
        while(integerListIterator.hasPrevious()){
            System.out.println("返回元素的索引：" + integerListIterator.previousIndex());
            System.out.println("返回元素：" + integerListIterator.previous());
        }
        System.out.println(list1);//[11, 22, 33, 44, 55]
        list1.set(3, 88);
        System.out.println(list1);//[11, 22, 33, 88, 55]
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);//[88, 55, 33, 22, 11]
        System.out.println("list1.subList(2,4) = " + list1.subList(2, 4));//[33, 22]

    }
}
