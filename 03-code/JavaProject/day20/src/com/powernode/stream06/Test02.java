package com.powernode.stream06;


import java.util.Comparator;
import java.util.function.Function;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("需求1：获得list中Student对象的个数");
        long count = StudentData.getStudentList().stream().count();
        System.out.println("count = " + count);
        System.out.println("需求2：获得年龄最大的学生");
        Student student = StudentData.getStudentList().stream()
                .max(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getAge() - o2.getAge();
                    }
                }).get();
        System.out.println(student);
        Student student1 = StudentData.getStudentList().stream()
                .max(( o1,  o2)-> o1.getAge() - o2.getAge()).get();
        System.out.println(student1);
        System.out.println("需求3：获得年龄最大的学生年龄");
        //1.获得所有年龄，2.求年龄最大值
        Integer maxAge = StudentData.getStudentList().stream()
                .map(new Function<Student, Integer>() {
                    @Override
                    public Integer apply(Student student) {
                        return student.getAge();
                    }
                })
                .max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.compare(o1, o2);
                    }
                })
                .get();

        Integer maxAge1 = StudentData.getStudentList().stream()
                .map(Student::getAge)
                .max(Integer::compare)
                .get();
        System.out.println("maxAge1 = " + maxAge1);


    }
}
