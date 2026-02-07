package com.powernode.stream02;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        //需求1：筛选出年龄>20的学生
        Stream<Student> stream = StudentData.getStudentList().stream();
        Stream<Student> studentStream = stream.filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getAge() > 20;//符合条件的元素，提取到流中
            }
        });
        //创建了新的流
        System.out.println(stream == studentStream);
        studentStream.forEach(System.out::println);
        //studentStream.forEach(System.out::println);

    }
}
