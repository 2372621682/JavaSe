package com.powernode.reflection04;

class Teacher{
    static {
        System.out.println("Teacher.static initializer");
    }
}
public class Test {
    public static void main(String[] args) throws Exception {
        //方式一：通过类名称.class获得class对象
        Class<Teacher> class1 = Teacher.class;

        //方式二：通过对象.getClass获得Class对象
        Teacher teacher = new Teacher();
        Class<? extends Teacher> class2 = teacher.getClass();

        //方式三：Class.forName("包名 + 类名")
        Class<?> class3 = Class.forName("com.powernode.reflection04.Teacher");

        //方式四：通过类加载器获得Classd对象
        //获得系统的类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> class4 = systemClassLoader.loadClass("com.powernode.reflection04.Teacher");

        //因为类的字节码文件对象只有一个,所有都是true
        System.out.println(class1 == class2);
        System.out.println(class2 == class3);
        System.out.println(class3 == class4);
        /**
         * 总结：
         *    1.方式一：通过类名称获得，不执行静态块
         *    2.方式二：通过对象获得，执行静态块
         *    3.方式三：通过包名 + 类名获得，执行静态块
         *    4.方式四：通过包名 + 类名获得，不执行静态块
         *    5.方式一和方式二，耦合性高，方式三和方式四耦合性低
         */
    }
}
