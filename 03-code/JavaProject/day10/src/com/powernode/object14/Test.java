package com.powernode.object14;

class Cat implements Cloneable{
    private String name = "喵喵";
    private int age = 2;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat();
        System.out.println(cat);
        Cat newCat = (Cat) cat.clone();
        System.out.println(newCat);

    }

}
