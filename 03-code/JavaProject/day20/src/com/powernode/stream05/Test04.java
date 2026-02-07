package com.powernode.stream05;

import java.util.function.Predicate;

public class Test04 {
    public static void main(String[] args) {
        //匹配：流中是否存在某个元素
        //需求1：流中Student对象是否都为男性
       /* boolean flag = StudentData.getStudentList().stream()
                .allMatch(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        return student.getSex() == '男';
                    }
                });
        System.out.println(flag);*/
        boolean allMatch = StudentData.getStudentList().stream().allMatch( student -> student.getSex() == '男');
        System.out.println("流中Student对象是否都为男性：" + allMatch);
        boolean anyMatch = StudentData.getStudentList().stream().anyMatch(student -> student.getSex() == '男');
        System.out.println("流中Student对象至少有一个为男性：" + anyMatch);
        boolean noneMatch = StudentData.getStudentList().stream().noneMatch(student -> student.getSex() == '男');
        System.out.println("流中Student对象一个都不为男性：" + noneMatch);


    }
}
