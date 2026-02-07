package com.powernode.stream07;


import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Test05 {
    public static void main(String[] args) {
        List<Student> list = StudentData.getStudentList();
        //需求1：统计元素个数
        long count = list.stream().count();
        System.out.println(count);
        //需求2：获得年龄的平均值
       /* Double avgAge = list.stream().collect(Collectors.averagingDouble(new ToDoubleFunction<Student>() {
            @Override
            public double applyAsDouble(Student student) {
                return student.getAge();
            }
        }));
        */
        Double avgAge = list.stream().collect(Collectors.averagingDouble(Student::getAge));
        System.out.println("avgAge = " + avgAge);
        //需求3：获得年龄最大的学生
        /*Optional<Student> collect = list.stream().collect(Collectors.maxBy(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        }));*/
        Student student = list.stream().collect(Collectors.maxBy((o1, o2) ->
                o1.getAge() - o2.getAge()
        )).get();
        System.out.println("student = " + student);
        //需求4：获得所有学生年龄之和
    /*    Integer sumAge = list.stream().collect(Collectors.summingInt(new ToIntFunction<Student>() {
            @Override
            public int applyAsInt(Student student1) {
                return student1.getAge();
            }
        }));*/
        Integer sumAge = list.stream().collect(Collectors.summingInt(Student::getAge));
        System.out.println("sumAge = " + sumAge);
        //需求5：统计汇总，年龄
       /* IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(new ToIntFunction<Student>() {
            @Override
            public int applyAsInt(Student student1) {
                return student1.getAge();
            }
        }));*/
        IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(Student::getAge));
        System.out.println(collect);

    }
}
