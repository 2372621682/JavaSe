package com.powernode.lambda08;

import com.powernode.lambda04.Function;

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
public class Test {
    public static void main(String[] args) {
        Function<String, Student> function = new Function<>() {
            @Override
            public Student apply(String s) {
                return new Student(s);
            }
        };

        Function<String, Student> function1 = Student::new;
        function1.apply("zs");

    }
}
