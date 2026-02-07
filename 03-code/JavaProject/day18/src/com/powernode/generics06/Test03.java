package com.powernode.generics06;

class IMath<K,V>{
    public void add(K k,V v){}
}
public class Test03 {
    public static void main(String[] args) {
        IMath<Integer, Double> iMath = new IMath<>();
        iMath.add(2,1.1);
    }
}
