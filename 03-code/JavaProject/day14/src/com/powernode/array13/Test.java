package com.powernode.array13;

import java.util.Arrays;
import java.util.Scanner;

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

    private int count;
    //2.添加学员
    //定义一个变量：count
    public void insert(Student student){

        //在正式插入之前，判断一下学生是否（sno）存在
        int index = isExists(student.getSno());
        if (index != -1) {
            System.out.println("需要添加的学生学号：【" + student.getSno() + "】已经存在");
            return;//结束方法
        }
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
    //4.判断学员是否存在
    private int isExists(int sno) {
        /**
         * 1.找到数组容器
         * 2.把数组容器中的学生学号一个个取出来 和 传入的sno进行匹配
         * 3.如果等值匹配成功返回true，说明容器中存在
         * 4.否则不存在
         */
        for (int i = 0; i < count; i++) {
            Student stu = stus[i];
            if (stu.getSno() == sno) return i;
        }
        return -1;
    }

    //3.查询学员
    public void queryAll(){
        for (int i = 0; i < count; i++) {//数组中存储几个元素，就输出几个
            Student stu = stus[i];
            System.out.println(stu);
        }
    }
    //5.修改学员
    /**
     * @param sno : 需要修改学生的编号
     * @param student：需要修改的数据，外界传入
     */
    public void updateStudentBySNO(int sno, Student student){
        //1.判断学生是否存在
      /*  boolean flag = isExists(sno);
        if (flag) {//存在
           *//* int[] ints = {1, 2, 3};
            ints[2] = 6;*//*
            //修改数组中的学员（需要获得下标）
            int updateIndex = getIndexBySNO(sno);
            //修改学员
            stus[updateIndex] = student;
        }*/
        int index = isExists(sno);
        if (index != -1) {//存在
            //修改学员
            stus[index] = student;
        }
    }
    //6.删除学生
    public void deleteStudentBySNO(int sno){
        //判断学生是否存在
        int index = isExists(sno);
        if (index == -1) {
            System.out.println("需要删除的学生学号：【" + sno + "】不存在");
            return;//结束方法
        }
        //把后面的往前挪动一位(数组：stus,索引：index)
        System.arraycopy(stus,index + 1,stus,index,stus.length - index - 1);
        //{1,2,3,4,5,6}，{1,2,3,5,6,6}
        //stus = Arrays.copyOf(stus, stus.length - 1);//{1,2,3,5,6}
        count --;
    }

}
public class Test {
    public static void main(String[] args) {
        /**
         * 1.do-while应用场景（简易版的增删改查的逻辑）
         * 2.界面如下：
         *    请选择如下操作：
         *       1.增加    2.删除    3.修改    4.查询    5.退出
         * 3.选择对应的编号执行相应的操作
         */
        int num = 0;
        StudentManager studentManager = new StudentManager();
        do {
            System.out.println("请选择如下操作：");
            System.out.println("1.增加   2.删除   3.修改   4.查询   5.退出");
            System.out.print("请选择（1-5）：");
            num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("----------执行增加操作------------");
                    System.out.println("请输入学号：");
                    int sno = new Scanner(System.in).nextInt();
                    System.out.println("请输入姓名：");
                    String name = new Scanner(System.in).next();
                    System.out.println("请输入年龄：");
                    int age = new Scanner(System.in).nextInt();
                    studentManager.insert(new Student(sno,name,age));
                    studentManager.queryAll();
                }
                case 2 -> {
                    System.out.println("----------执行删除操作------------");
                    System.out.println("请输入学号：");
                    int sno = new Scanner(System.in).nextInt();
                    studentManager.deleteStudentBySNO(sno);
                    studentManager.queryAll();
                }
                case 3 -> {
                    System.out.println("----------执行修改操作------------");
                    System.out.println("请输入学号：");
                    int updateSno = new Scanner(System.in).nextInt();

                    System.out.println("请输入学号：");
                    int sno = new Scanner(System.in).nextInt();
                    System.out.println("请输入姓名：");
                    String name = new Scanner(System.in).next();
                    System.out.println("请输入年龄：");
                    int age = new Scanner(System.in).nextInt();
                    studentManager.updateStudentBySNO(updateSno,new Student(sno,name,age));
                    studentManager.queryAll();
                }
                case 4 -> {
                    System.out.println("----------执行查询操作------------");
                    studentManager.queryAll();
                }
                case 5 -> System.out.println("----------执行退出操作------------");
                default -> System.out.println("----------无效操作------------");
            }
        }while(num != 5);
    }
}
