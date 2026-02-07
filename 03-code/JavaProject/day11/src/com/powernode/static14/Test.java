package com.powernode.static14;

class Cat{
    static {
        System.out.println("Cat.static initializer");
    }
}
class Dog{
    static {
        System.out.println("Dog.static initializer");
    }
}
public class Test {
    public static void main(String[] args) {
        /**
         * 1.只加载了Cat.class，执行静态块且只执行一次
         * 2.Dog类不加载，静态块不执行
         * 3.需要Dog的时候才会加载，这就是懒加载
         * 4.JVM就是懒加载的机制
         * 5.new了两个Cat对象，也只输出一次静态块的内容
         */
        new Cat();
        new Cat();
    }
}
