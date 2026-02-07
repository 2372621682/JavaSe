package com.powernode.exception12;

import java.io.FileNotFoundException;

class Person{
    public void eat()throws Exception{
        System.out.println("Person.eat");
    }
}
class Teacher extends Person{
    //子类抛出的异常 <= 父类抛出的异常，在实际工作中，一般都一样
    @Override
    public void eat()throws FileNotFoundException {
        System.out.println("Teacher.eat");
    }
}
public class Test {

}
