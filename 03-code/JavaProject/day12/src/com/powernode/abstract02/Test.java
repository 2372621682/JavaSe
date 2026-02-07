package com.powernode.abstract02;
 abstract  class Pet{
    /**
     * 1.什么样的方法，应该声明为抽象的呢？
     *    1.一个类的具体行为不清楚，我们可以把这个方法声明为抽象的
     *    2.比如：宠物，都有吃饭和睡觉的方法，但是我们不确定具体的行为，可以声明为抽象的
     * 2.抽象方法的特点
     *    1.使用abstract去修饰方法
     *    2.没有方法体
     *    3.抽象方法必须存在于抽象类中
     * 3.抽象的继承
     *    1.子类如果不是抽象类，必须重写所有的抽象方法
     *    2.子类如果是抽象类，不强制重写抽象方法
     *
     */
    public abstract void eat();

    public abstract void sleep();
}
class Cat extends Pet{

    @Override
    public void eat() {
        System.out.println("Cat.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat.sleep");
    }
}
public class Test {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.eat();
        pet.sleep();
    }
}
