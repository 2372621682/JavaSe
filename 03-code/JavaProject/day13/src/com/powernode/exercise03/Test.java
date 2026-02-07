package com.powernode.exercise03;
class MyMath{
    public static final double PI = 3.14;
}
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return MyMath.PI * radius * radius;
    }
}
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.6);
        System.out.println(circle.getArea());

    }
}
