package com.powernode.package17.model;

 public class Teacher {
     /**
      * 1.public:公共的
      * 2.protected：受保护的
      * 3.default：默认的（不写）
      * 4.private :私有的
      * 注意：protected和private不可以修饰类
      * 类的访问修饰符主要用于限定类在其他类或包中的可见性，以实现封装和模块化设计。
      * Java 中外部类仅支持两种访问修饰符：
      * public：所有包中的类都可访问。
      * 默认（无修饰符）：仅同一包中的类可访问。
      */
     public String name = "zs";
     protected int age = 23;
     char sex = '男';
     private String address = "北京";
}
