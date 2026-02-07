package com.powernode.generics03;

import java.util.ArrayList;
import java.util.List;

class Person{}
class Teacher extends Person{}
public class Test02 {
    public static void main(String[] args) {
        List<Person> lp = new ArrayList<>();
        printList(lp);
        List<Teacher> lt = new ArrayList<>();
        //printList(lt);
    }
    //List<Person> lp = new ArrayList<Teacher>();
    private static void printList(List<Person> lp) {
    }
}
