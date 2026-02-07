package com.powernode.stream05;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
       //需求：输出 年龄 > 18 的学生对象
        StudentData.getStudentList().stream()
                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        return student.getAge() > 18;
                    }
                })
                .forEach(new Consumer<Student>() {
                    @Override
                    public void accept(Student student) {
                        System.out.println(student);
                    }
                });
        System.out.println("=====================");
        StudentData.getStudentList().stream()
                .filter( student->
                         student.getAge() > 18
                )
                .forEach(System.out::println);

    }
}
