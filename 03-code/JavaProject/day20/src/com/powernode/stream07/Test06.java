package com.powernode.stream07;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test06 {
    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        //需求：按照学生的性别进行分组，性别为key，集合为value
        Map<Character, List<Student>> collect = list.stream().collect(Collectors.groupingBy(new Function<Student, Character>() {
            @Override
            public Character apply(Student student) {
                return student.getSex();
            }
        }));
        System.out.println(collect);
        collect.forEach(new BiConsumer<Character, List<Student>>() {
            @Override
            public void accept(Character k, List<Student> v) {
                System.out.println(k + ":" + v);
            }
        });
    }
}
