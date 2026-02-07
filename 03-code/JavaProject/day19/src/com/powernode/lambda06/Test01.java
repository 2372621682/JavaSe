package com.powernode.lambda06;

import com.powernode.lambda04.Supplier;

class Teacher{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("zs");
        Supplier<String> supplier = new Supplier<>() {
            @Override
            public String get() {
                return teacher.getName();
            }
        };
        /**
         * 函数式接口中方法    【返回类型】  和 【参数】
         * 与
         * 内部方法           【返回类型】  和 【参数】
         *     返回类兼容，参数值一样
         */
        //语法规则：对象名称::方法名称
        Supplier<String> supplier1 = teacher::getName;
    }
}
