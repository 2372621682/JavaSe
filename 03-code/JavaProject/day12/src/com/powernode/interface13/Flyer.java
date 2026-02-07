package com.powernode.interface13;

public interface Flyer {
    default void land(){
        System.out.println("Flyer.land");
    }
    default void swim(){
        System.out.println("Flyer.swim");
    }
}
interface Swimming{
    default void swim(){
        System.out.println("Swimming.swim");
    }
}
class Bird implements Flyer,Swimming{

    /**
     * 如果多个接口有相同的默认方法时，子类必须重写一个
     */
    @Override
    public void swim() {
        Flyer.super.swim();//调用Flyer的默认方法
        Swimming.super.swim();//调用Swimming的默认方法
    }
}
class Test{
    public static void main(String[] args) {
        Bird bird = new Bird();
       /* bird.swim()*/
    }
}