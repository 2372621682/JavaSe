package com.powernode.stream02;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "word", "java", "too");
        //需求1：把流中字母转换为大写
       /* stream.map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/
        stream.map(String::toUpperCase).forEach(System.out::println);
        System.out.println("需求2：获得集合中所有学生的姓名");
        List<Student> studentList = StudentData.getStudentList();
        /*studentList.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).forEach(System.out::println);*/
        studentList.stream().map( Student::getName).forEach(System.out::println);
        System.out.println("需求3：获得集合中性别为男的学生姓名");
        /**
         * 1.筛选：性别为男的学生对象
         * 2.映射：通过学生对象获得学生姓名
         */
        Stream<Student> stream1 = StudentData.getStudentList().stream();
       /* stream1.filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getSex() == '男';
            }
        }).map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).forEach(System.out::println);*/
        stream1.filter( student-> student.getSex() == '男')
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
