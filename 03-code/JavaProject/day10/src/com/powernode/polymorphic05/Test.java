package com.powernode.polymorphic05;

class Animal{
    public void eat(){
        System.out.println("Aniaml.eat");
    }
    public void sleep(){
        System.out.println("Animal.sleep");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat.eat鱼");
    }

    @Override
    public void sleep() {
        System.out.println("Cat.sleep");
    }

    public void catchMouse(){
        System.out.println("Cat.catchMouse");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal ac = new Cat();
        ac.eat();
        ac.sleep();
        //ac对象只能调用父类存在的方法，不能调用子类特有的方法
        //ac.catchMouse();
        //如果需要调用子类特有的方法，就需要向下转型
        double d = 1.2;
        int i = (int)d;
        //向下转型：其实就是强制转换
        Cat cat = (Cat) ac;
        cat.catchMouse();

    }
}
