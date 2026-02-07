package com.powernode.exercise05;

import java.math.RoundingMode;

class Room{
    private int rNO;
    private double area;
    private String address;

    public Room() {
        this(0);
    }

    public Room(int rNO) {
        /*this.rNO = rNO;*/
        this(rNO,0);
    }

    public Room(int rNO, double area) {
        /*this.rNO = rNO;
        this.area = area;*/
        this(rNO, area, "");
    }

    public Room(int rNO, double area, String address) {
        this.rNO = rNO;
        this.area = area;
        this.address = address;
    }

    public int getrNO() {
        return rNO;
    }

    public void setrNO(int rNO) {
        this.rNO = rNO;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return "Room{" +
                "rNO=" + rNO +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Room r1 = new Room();
        System.out.println(r1.getDetails());

        Room r2 = new Room(1001);
        System.out.println(r2.getDetails());

        Room r3 = new Room(1001, 99.9);
        System.out.println(r3.getDetails());

        Room r4 = new Room(1001,89.9,"北京");
        System.out.println(r4.getDetails());
    }
}
