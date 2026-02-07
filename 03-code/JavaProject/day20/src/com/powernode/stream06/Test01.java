package com.powernode.stream06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("需求1：获得所有元素相加的结果");
        Optional<Integer> reduce = list.stream().reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                //return x + y;
                return Integer.sum(x, y);
            }
        });
        System.out.println("获得所有元素相加的结果： " + reduce.get());

        Optional<Integer> reduce1 = list.stream().reduce(Integer::sum);
        System.out.println("获得所有元素相加的结果： " + reduce1.get());

        System.out.println("需求2：获得所有元素相乘的结果");
        Integer integer = list.stream().reduce(( x,  y)-> x * y).get();
        System.out.println("需求3：获得最大长度的元素");
        String s = Stream.of("aa", "bbb", "cccc", "ddddd", "ee")
                .reduce(new BinaryOperator<String>() {
                    @Override
                    public String apply(String s1, String s2) {
                        return s1.length() > s2.length() ? s1 : s2;
                    }
                }).get();
        System.out.println(s);
        System.out.println("需求4：获得Student对象所有年龄之和");
        //1.拿到年龄，2.求和
        Integer sumAge = StudentData.getStudentList().stream()
                .map(new Function<Student, Integer>() {
                    @Override
                    public Integer apply(Student student) {
                        return student.getAge();
                    }
                }).reduce(new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer x, Integer y) {
                        return Integer.sum(x, y);
                    }
                }).get();
        System.out.println("sumAge = " + sumAge);
        System.out.println("-----------------");
        Integer sumAge1 = StudentData.getStudentList().stream()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .get();
        System.out.println("sumAge1 = " + sumAge1);
        System.out.println("需求5：获得一个数和所有年龄之和相加");
        Integer reduce2 = list.stream().reduce(10, Integer::sum);
        System.out.println("reduce2 = " + reduce2);

    }
}
