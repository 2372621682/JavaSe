package com.powernode.polymorphic22;

//动物
class Animal{
    public void sleep(){
        System.out.println("Animal.sleep");
    }
    public void eat(){
        System.out.println("Animal.eat");
    }
}
//猫
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat.eat鱼");
    }

    @Override
    public void sleep() {
        System.out.println("Cat.sleep");
    }
}
//狗
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog.eat骨头");
    }

    @Override
    public void sleep() {
        System.out.println("Dog.sleep");
    }
}


public class Test {
    public static void main(String[] args) {
       /* Cat cat = new Cat();
        cat.eat();
        cat.sleep();*/
        //父类 父对象 = new 子类([实参列表])
        Animal ac = new Cat();
        /*ac.eat();
        ac.sleep();*/
        method(ac);

        /*Dog dog = new Dog();
        dog.eat();
        dog.sleep();*/
        Animal ad = new Dog();
       /* ad.eat();
        ad.sleep();*/
        method(ad);
    }
    public static void method(Animal animal){
        animal.eat();
        animal.sleep();
    }
}
