package com.powernode.stream03;



import java.util.function.Function;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        Stream<Student> stream = StudentData.getStudentList().stream();
        //需求1.去除重复的学生【注意：自定义对象，去除重复内容，重写hashCode和equals】
        stream.distinct().forEach(System.out::println);
        System.out.println("需求2：去除重复的学生，输出学生的姓名");
        /**
         * 1.distinct ：去除重复学生
         * 2.map:映射学生年龄
         */
        StudentData.getStudentList().stream()
                .distinct()
                .map(new Function<Student, String>() {
                    @Override
                    public String apply(Student student) {
                        return student.getName();
                    }
                })
                .forEach(System.out::println);
        System.out.println("========优化========");
        StudentData.getStudentList().stream()
                .distinct()
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
