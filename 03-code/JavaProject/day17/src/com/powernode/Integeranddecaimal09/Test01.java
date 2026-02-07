package com.powernode.Integeranddecaimal09;

import java.math.BigInteger;

public class Test01 {
    public static void main(String[] args) {
        //long l = 12345678901234567890L;//Long number too large
        BigInteger bigInteger = new BigInteger("12345678901234567890");
        //加
        System.out.println(bigInteger.add(new BigInteger("1")));
        System.out.println("bigInteger = " + bigInteger);
        //减
        System.out.println(bigInteger.subtract(new BigInteger("1")));
        //乘
        System.out.println(bigInteger.multiply(new BigInteger("10")));
        //除
        System.out.println(bigInteger.divide(new BigInteger("10")));
        //取余
        BigInteger bigInteger1 = new BigInteger("10");
        BigInteger[] bigIntegers = bigInteger1.divideAndRemainder(new BigInteger("3"));
        System.out.println(bigIntegers[0]);//商
        System.out.println(bigIntegers[1]);//余数
    }
}
