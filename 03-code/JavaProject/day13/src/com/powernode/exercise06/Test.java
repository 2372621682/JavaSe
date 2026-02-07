package com.powernode.exercise06;

import java.util.Collection;

interface Clothing{
    public abstract double calcArea(double size);
}
abstract class Frock {
    public String color;

    public Frock(String color) {
        this.color = color;
    }
    public abstract String getColor();
}
class Shirt extends Frock implements Clothing {
    private double price;

    public Shirt(String color,double price) {
        super(color);
        this.price = price;
    }

    @Override
    public String getColor() {
        return "red";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calcArea(double size) {
        return size * 1.3;
    }
}
public class Test {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("red", 100);
        System.out.println(shirt.calcArea(2.3));

        Frock frock = new Shirt("red", 100);
        //System.out.println(frock.calcArea(2.3));
        Clothing clothing = new Shirt("red", 100);
        System.out.println(clothing.calcArea(2.3));
    }
}
