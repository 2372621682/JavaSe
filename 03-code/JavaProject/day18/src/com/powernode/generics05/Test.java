package com.powernode.generics05;

import java.util.ArrayList;
import java.util.List;

class Person{}
class Teacher extends Person{}
class Student extends Person{}
public class Test {
    public static void main(String[] args) {
        List<Person> lp = new ArrayList<>();
        printList(lp);
        List<Teacher> lt = new ArrayList<>();
        printList(lt);
        List<Student> ls = new ArrayList<>();
        printList(ls);
        System.out.println("--------------");
        printList01(lp);
        printList01(lt);
        //printList01(ls);
    }

    /**
     * 1.向上限定(确定了父类) :List<? extends Person>
     *     1. ? 是占位符，表示不确定
     *     2. ? extends Person，说明子类不确定
     *     3. 可以传递：
     *         1.父类
     *         2.子类
     */
    private static void printList(List<? extends Person> lp) {
    }

    /**
     * 2.向下限定（确定子类）：List<? super Teacher>
     *     1. ? 是占位符，表示不确定
     *     2.? super Teacher ： 说明父类不确定
     *     3. 可以传递：
     *        1.父类
     *        2.子类（确定的子类Teacher)
     */
    private static void printList01(List<? super Teacher> lp) {
    }



}
