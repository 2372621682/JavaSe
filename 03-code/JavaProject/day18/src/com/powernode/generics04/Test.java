package com.powernode.generics04;

import java.util.ArrayList;
import java.util.List;

class Person{}
class Teacher extends Person{}
public class Test {
    public static void main(String[] args) {
        List<Person> lp = new ArrayList<>();
        printList(lp);
        List<Teacher> lt = new ArrayList<>();
        //printList(lt);
    }

    /**
     * - 方法重载
     *     1.同一个类中
     *     2.方法名称相同
     *     3.参数列表不同
     *        1.个数不同
     *        2.类型不同
     *        3.顺序不同
     *  注意：方法重载，参数列表，忽略泛型，所报错
     */
    //List<Person> lp = new ArrayList<Teacher>();
    private static void printList(List<Person> lp) {
    }
  /*  private static void printList(List<Teacher> lp) {
    }*/
}
