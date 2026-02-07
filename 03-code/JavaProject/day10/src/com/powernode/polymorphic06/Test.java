package com.powernode.polymorphic06;

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
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog.sleep");
    }

}
public class Test {
    public static void main(String[] args) {
        Animal ac = new Cat();
        method(ac);

        Animal ad = new Dog();
        method(ad);
    }
    public static void method(Animal animal){
        animal.eat();
        animal.sleep();
        /**
         * 1.调用Cat特有的方法catchMouse
         * 2.就需要向下转型
         * 3.错误：ClassCastException ：类转换异常
         *    Dog cannot be cast to class Cat
         */
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
