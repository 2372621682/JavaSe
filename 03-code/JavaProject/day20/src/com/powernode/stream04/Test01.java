package com.powernode.stream04;


import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("需求1：对流中的数据进行去重后升序排序");
        Stream.of(33, 11, 22, 44, 11, 22, 55)
                .distinct()
                .sorted()//默认升序
                .forEach(System.out::println);
        System.out.println("需求2：对流中的数据进行去重后降序排序");
        Stream.of(33, 11, 22, 44, 11, 22, 55)
                .distinct()
                .sorted(( o1,  o2) -> o2-o1)//默认升序
                .forEach(System.out::println);
        System.out.println("需求3：按照学生年龄升序排序");
        StudentData.getStudentList().stream()
                .sorted()//对自定义对象进行排序，必须让类实现Comparable接口，让类具有比较性
                .forEach(System.out::println);
        System.out.println("需求4：去除重复学生后，按照年龄进行降序排序，输出学生年龄");
        /*StudentData.getStudentList().stream()
                .distinct()
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.getAge() - o1.getAge();
                    }
                })
                .map(new Function<Student, Integer>() {
                    @Override
                    public Integer apply(Student student) {
                        return student.getAge();
                    }
                })
                .forEach(System.out::println);*/
        StudentData.getStudentList().stream()
                .distinct()
                .sorted(( o1,  o2)->
                         o2.getAge() - o1.getAge()
                )
                .map(Student::getAge)
                .forEach(System.out::println);
    }
}
