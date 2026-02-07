package com.powernode.package17.test;
//跨包访问类，该类必须是public的
import com.powernode.package17.model.Teacher;

public class Test extends Teacher{
    public static void main(String[] args) {
        /**
         * 访问权限修饰符的总结（记住）
         *    修饰符       同类     同包     子类     全局
         *    private     可以     不可以   不可以   不可以
         *    default     可以     可以    不可以   不可以
         *    protected   可以     可以    可以     不可以
         *    public      可以     可以    可以     可以
         *    从大到小的权限排序：public > protected > default > private
         */
        Teacher teacher = new Teacher();
        System.out.println(teacher.name);
        //System.out.println(teacher.age);

    }
    public void method(){
        System.out.println(name);
        System.out.println(age);
        //System.out.println(sex);
        //System.out.println(address);
    }
}
