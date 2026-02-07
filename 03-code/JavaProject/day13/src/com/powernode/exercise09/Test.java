package com.powernode.exercise09;

interface Collection{
    public void add(Object object);
}
interface Set {
    public int max(int x,int y);
}
class HashSet implements Set,Collection{

    @Override
    public int max(int x, int y) {
        return x > y ? x : y;
    }

    @Override
    public void add(Object object) {
        System.out.println("添加了" + object);
    }
}
public class Test {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("你好");
        Set set = new HashSet();
        //set.add(123);
        System.out.println(set.max(2, 3));

    }
}
