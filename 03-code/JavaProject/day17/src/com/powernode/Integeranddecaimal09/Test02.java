package com.powernode.Integeranddecaimal09;

import java.math.BigDecimal;

public class Test02 {
    public static void main(String[] args) {
        //小数不够用了使用BigDecimal
        BigDecimal bigDecimal = new BigDecimal("123.123");
        System.out.println(bigDecimal.add(new BigDecimal("1.1")));


    }
}
