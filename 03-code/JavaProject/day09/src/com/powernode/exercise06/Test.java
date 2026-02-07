package com.powernode.exercise06;

class Computer{
    private double cpu ;
    private int memory;
    private int hardDisk;

    public Computer() {
    }

    public Computer(double cpu, int memory, int hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getDetails() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        System.out.println(c1.getDetails());

        Computer c2 = new Computer(1.8,16,3);
        System.out.println(c2.getDetails());
    }
}
