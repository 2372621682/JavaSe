package com.powernode.polymorphic21;

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
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        /**
         * 以上代码可以进行优化，eat和sleep存在代码冗余
         */
    }
}
