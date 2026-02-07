package com.powernode.exercise01;
class Student{
   /* private static int currentStudentNO = 0;

    public static int getCurrentStudentNO() {
        return ++currentStudentNO ;
    }*/
   private  int currentStudentNO = 0;

    public  int getCurrentStudentNO() {
        return ++currentStudentNO ;
    }
}
public class Test {
    public static void main(String[] args) {
       /* System.out.println(Student.getCurrentStudentNO());//1
        System.out.println(Student.getCurrentStudentNO());//2
        Student student = new Student();
        System.out.println(student.getCurrentStudentNO());//3*/
        Student stu = new Student();
        System.out.println(stu.getCurrentStudentNO());//1
        System.out.println(stu.getCurrentStudentNO());//2
        Student newStu = new Student();
        System.out.println(newStu.getCurrentStudentNO());//1

    }
}
