package com.powernode.exercise04;
abstract class Frock{
    private String color;

    public Frock(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double caleArea(double size);
}
class Shirt extends Frock{
    private double price;

    public Shirt(String color,double price) {
        super(color);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double caleArea(double size) {
        return size * 1.3;
    }

}
public class Test {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("red",100);
        System.out.println(shirt.caleArea(2.3));

        Frock frock = new Shirt("red", 100);
        System.out.println(frock.caleArea(2.3));
    }
}
