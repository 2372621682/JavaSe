package com.powernode.extends13;

public class Person {
    public void sleep(){
        System.out.println("Person.躺着睡");
    }
}

/**
 * 1.Teacher 继承了 Person，Teacher就拥有了sleep方法
 * 2.但是午休办公室没有床，老师午休趴着睡
 * 3.子类继承父类的方法，不能满足子类的需求
 * 4.这种情况，我们可以私用【方法重写】来实现子类个性化的需求
 *
 */
class Teacher extends Person{
    public void sleep(){
        System.out.println("趴着睡");
    }
}
class Student extends Person{

}
class Test{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        /**
         * 1.方法访问的规则：
         *    1.子类如果有，访问子类的
         *    2.子类如果没有，访问父类的
         *    3.父类也没有，报错
         */
        teacher.sleep();

        Student student = new Student();
        student.sleep();

    }
}
