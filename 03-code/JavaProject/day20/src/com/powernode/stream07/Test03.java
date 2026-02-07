package com.powernode.stream07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 将年龄>=18的女学生，按照年龄升序归集到ArrayList中
         *   1.过滤：年龄>=18的女学生
         *   2.排序：年龄排序
         *   3.归集到ArrayList
         */
        /*StudentData.getStudentList().stream()
                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        return student.getAge() >= 18 && student.getSex() == '女';
                    }
                })
                .sorted()
                .collect(Collectors.toCollection(new Supplier<ArrayList<Student>>() {
                    @Override
                    public ArrayList<Student> get() {
                        return new ArrayList<>();
                    }
                }))
                .forEach(System.out::println);*/
        StudentData.getStudentList().stream()
                .filter( student -> student.getAge() >= 18 && student.getSex() == '女')
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);
    }
}
