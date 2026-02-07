package com.powernode.collection07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 1.添加
         *    boolean add(E e)	添加e元素对象到当前集合中,添加成功返回true
         *    boolean addAll(Collection<? extends E> c)	添加c集合中的所有元素对象到当前集合中，添加成功返回true
         * 2.判断
         *    boolean contains(Object o)	判断当前集合中是否包含0对象，包含返回true
         *    boolean containsAll(Collection<?> c)	判断当前集合是否包含c集合中所有元素，包含返回true
         *    boolean equals(Object o)	判断当前集合的元素值是否等于o集合
         *    boolean isEmpty()	判断当前集合是否为空集合
         * 3.查询
         *    int hashCode()	获取集合对象的哈希值
         *    Iterator<E> iterator() 	返回此集合中的元素的迭代器。
         *    int size()	获取当前集合中实际存储的元素个数
         * 4.删除
         *    void clear()	清空集合元素
         *    E remove(int index )	删除集合中索引为index的对象，返回删除的对象
         *    boolean removeAll(Collection<?> c) 	从集合中删除 c集合
         *    boolean retainAll(Collection<?> c)	仅保留c中的集合元素
         * 5.数组与集合
         *    Object[] toArray()	返回包含当前集合中所有元素的数组
         *    <T> T[] toArray(T[] a)	把集合转换为指定类型的数组
         * 6.关于Stream流
         *    default Stream<E> parallelStream()	返回一个可能并行 Stream与集合的来源。
         *    default boolean removeIf(Predicate<? super E> filter)	当前集合中与filter的交集
         *    default Spliterator<E> spliterator()	创建此集合中的元素的 Spliterator。
         *    default Stream<E> stream() 	返回一个序列 Stream与集合的来源。
         */
        /**
         * 4.删除
         *    void clear()	清空集合元素
         *    E remove(Object o )	删除集合中指定的数据
         *    boolean removeAll(Collection<?> c) 	从集合中删除 c集合
         *    boolean retainAll(Collection<?> c)	仅保留c中的集合元素
         */
        Collection<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        System.out.println("integers1.remove(2) = " + integers1.remove(2));
        System.out.println(integers1);//[1, 3]

        Collection<Integer> integers2 = new ArrayList<>();
        integers2.add(4);
        integers2.add(5);
        integers2.add(6);
        integers1.addAll(integers2);
        System.out.println("integers1 = " + integers1);//[1, 3, 4, 5, 6]
        integers1.removeAll(integers2);
        System.out.println("integers1 = " + integers1);//[1, 3]
        integers1.addAll(integers2);
        System.out.println("integers1 = " + integers1);//[1, 3, 4, 5, 6]
        integers1.retainAll(integers2);
        System.out.println("integers1 = " + integers1);//[4, 5, 6]
        integers1.clear();
        System.out.println("integers1 = " + integers1);//[]
        /**
         * 5.数组与集合
         *    Object[] toArray()	返回包含当前集合中所有元素的数组
         *    <T> T[] toArray(T[] a)	把集合转换为指定类型的数组
         */
        Collection<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(22);
        integers.add(33);
        //Object 类型处理不方便
        Object[] array = integers.toArray();
        //把集合转换为指定类型的数组
        Integer[] array1 = integers.toArray(new Integer[integers.size()]);
        System.out.println(Arrays.toString(array1));//[11, 22, 33]

    }
}
