package com.powernode.exception11;
class Person{
    public void eat(){
        System.out.println("Person.eat");
    }
}
class Teacher extends Person{
    //父类没有抛出异常，子类也不可以抛出异常（针对受检异常，非受检异常不受控制
    @Override
    public void eat()throws RuntimeException {
        System.out.println("Teacher.eat");
    }
}
public class Test {

}
