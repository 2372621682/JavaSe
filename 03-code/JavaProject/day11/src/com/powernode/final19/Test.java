package com.powernode.final19;

class Person{
    public final void eat(){
        System.out.println("Person.eat");
    }
}
class Teacher extends Person{
    //'eat()' cannot override 'eat()' in 'com.powernode.final19.Person'; overridden method is final
   /* @Override
    public void eat() {
        super.eat();
    }*/
}
public class Test {
}
