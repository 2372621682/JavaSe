package com.powernode.array06;

import java.util.Arrays;

class Student{
    private int sno;
    private String name;
    private int age;

    public Student(int sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/**
 * 1.学生管理系统（基于数组），管理学生
 *     1.添加学生
 *     2.查询学生
 *     3.修改学生
 *     4.删除学生
 * 2.设计几个类：
 *     1.Student
 *     2.StudentManager
 *     3.Test测试类
 */
class StudentManager{
    //1.定义容器，用来存储学生对象
    private Student[] stus = new Student[2];;

    //2.添加学员
    //定义一个变量：count
    private int count;
    public void insert(Student student){
        /**
         * 1.如果容量不够了，就需要扩容
         * 2.在插入之前进行判断容器容量
         *    1.目前有多少个元素：count
         *    2.容器的容量：stus.length
         *    3.count >= stus.length : 进行扩容
         */
        if (count >= stus.length) {
            /**
             * T[] original:需要复制的数组
             * int newLeng ： 新数组的长度，扩容后的长度
             */
            stus = Arrays.copyOf(stus, stus.length << 1);
        }
        stus[count ++] = student;
    }
    //3.查询学员
    public void queryAll(){
        for (int i = 0; i < count; i++) {//数组中存储几个元素，就输出几个
            Student stu = stus[i];
            System.out.println(stu);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.insert(new Student(1001,"zs",23));
        studentManager.insert(new Student(1002,"ls",20));
        studentManager.insert(new Student(1003,"ww",26));
        studentManager.queryAll();
    }
}
