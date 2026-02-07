package com.powernode.reflection05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class Teacher{
    private String name;
    private int age;

    public Teacher() {
        System.out.println("Teacher.Teacher");
    }

    protected Teacher(String name) {
        this.name = name;
        System.out.println("name = " + name);
    }

    private Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("name = " + name + ", age = " + age);
    }
}
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * - 构造器包含的元素
         *    1.修饰符
         *    2.名称
         *    3.参数类型
         *    4.调用构造器
         */
        //1.获得Class文件对象
        Class<Teacher> teacherClass = Teacher.class;
        //2.用于获取该类所有【public】构造方法
        //Constructor<?>[] constructors = teacherClass.getConstructors();
        //3.用于获取该类【所有的】构造方法
        Constructor<?>[] declaredConstructors = teacherClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println("修饰符：" + Modifier.toString(constructor.getModifiers()));
            //System.out.println("构造器名称：" + constructor.getName());com.powernode.reflection05.Teacher
            System.out.println("构造器名称：" + constructor.getDeclaringClass().getSimpleName());//Teacher
            //4.获得参数列表
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
               // System.out.println("参数类型：" + parameterType.getName());
                System.out.println("参数类型：" + parameterType.getSimpleName());
            }
        }
        System.out.println("---------调用构造器---------");
        Class<Teacher> teacherClass1 = Teacher.class;
        //1.调用无参构造器
        Teacher teacher = teacherClass1.newInstance();
        //2.调用有参构造器
        //2.1 获得构造器对象
        Constructor<Teacher> declaredConstructor = teacherClass1.getDeclaredConstructor(String.class);
        //2.2 通过构造器对象调用构造器
        Teacher teacher1 = declaredConstructor.newInstance("zs");
        //3.调用私有参构造器
        //3.1获得构造器对象
        Constructor<Teacher> declaredConstructor1 = teacherClass1.getDeclaredConstructor(String.class, int.class);
        //3.2  私有方法，在调用之前要先设置访问权限为（true)，否则抛出：IllegalAccessException
        declaredConstructor1.setAccessible(true);
        //3.3 通过构造器对象调用构造器
        Teacher teacher2 = declaredConstructor1.newInstance("zs", 23);

    }
}
