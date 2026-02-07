package com.powernode.static07;

class Teacher {
    String name;
    int age;
    //部门经费
    static double deptExpenditure = 8000;
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Teacher.deptExpenditure);//8000
        Teacher t1 = new Teacher();
        System.out.println(t1.name);
        System.out.println(t1.age);
        t1.deptExpenditure += 1000;
        System.out.println(t1.deptExpenditure);//9000
        System.out.println(Teacher.deptExpenditure);//9000

        Teacher t2 = new Teacher();
        System.out.println(t2.deptExpenditure);//9000
    }
}
