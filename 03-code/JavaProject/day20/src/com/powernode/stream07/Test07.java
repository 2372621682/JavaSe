package com.powernode.stream07;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test07 {
    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        //需求：将学生姓名连接成一个字符串，中间使用逗号隔开
      /*  String collect = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).collect(Collectors.joining(","));
        System.out.println(collect);*/
        String collect = list.stream().map(Student::getName).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
