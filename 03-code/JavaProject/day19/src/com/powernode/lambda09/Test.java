package com.powernode.lambda09;

import java.util.function.BiFunction;

class Student{
    private String name;
    private int age;
    private  char sex;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
@FunctionalInterface
interface TriFunction<T, U, V,R> {
    R apply(T t, U u,V v);
}
public class Test {
    public static void main(String[] args) {
        System.out.println("===============两个参数==================");
        BiFunction<String, Integer, Student> biFunction = new BiFunction<>() {
            @Override
            public Student apply(String name, Integer age) {
                return new Student(name, age);
            }
        };
        BiFunction<String, Integer, Student> biFunction1 = Student::new;
        System.out.println(biFunction1.apply("zs", 23));
        System.out.println("===============三个参数==================");
        TriFunction<String, Integer, Character, Student> triFunction = new TriFunction<>() {
            @Override
            public Student apply(String name, Integer age, Character sex) {
                return new Student(name,age,sex);
            }
        };
        TriFunction<String, Integer, Character, Student> triFunction1 = Student::new;
        System.out.println(triFunction1.apply("zs", 23, '男'));
    }
}
