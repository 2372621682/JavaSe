package com.powernode.polymorphic07;

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
         * 4.animal 有可能指向Cat对象，也有可能指向Dog对象
         * 5.所以所以我们在强制转换之前要添加判断
         */
        if (animal instanceof Cat) {//判断animal是否指向Cat对象，如果指向返回true，否则返回false
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }else{
            System.out.println("没有指向Cat对象");
        }

    }
}
