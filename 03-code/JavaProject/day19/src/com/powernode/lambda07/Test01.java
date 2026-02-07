package com.powernode.lambda07;

import com.powernode.lambda04.Supplier;

class Student{
    public Student() {
        System.out.println("Student.Student");
    }
}
public class Test01 {
    public static void main(String[] args) {
        Supplier<Student> supplier = new Supplier<>() {
            @Override
            public Student get() {
                return new Student();
            }
        };

        /**
         * 语法规则：类名称::new
         * 满足条件
         *      1.函数式接口方法的参数    与  构造器方法参数值一样
         *      2.返回类型兼容
         */
        Supplier<Student> supplier1 = Student::new;

        Supplier<Object> supplier2 = new Supplier<>() {
            @Override
            public Object get() {
                return new Student();
            }
        };

        Supplier<Object> supplier3 = Student::new;
        Object o = supplier3.get();

    }
}
