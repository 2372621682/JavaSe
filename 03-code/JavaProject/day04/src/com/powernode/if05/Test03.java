package com.powernode.if05;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 需求：某电信公司电话计费规则如下：
         *   1.前3分钟，2角
         *   2.之后一分钟，1.5角
         *   3.不够一分钟，按照一分钟算
         *   4.求 x 秒，需要多少钱
         */
        //1.定义一个变量，获得打电话的秒数
        int seconds = new Scanner(System.in).nextInt();
        double telephoneCharges = 2;
        //超出的分钟数
        /*int count = 0;
        if (seconds > 180){//大于3分钟的(超出分钟数)
            *//**
             * 1.整分整秒
             * 2.不是整分整秒
             *//*
            if (seconds % 60 == 0) {//1.整分整秒
                count = (seconds - 180) / 60;
            }else{//2.不是整分整秒
                count = (seconds - 180) / 60 + 1;//我们计算的是整数，舍弃了小数，所以+1
            }
        }*/
        int count = seconds > 180? seconds % 60 == 0? (seconds - 180) / 60: (seconds - 180) / 60 + 1: 0;
        System.out.println(seconds == 0?0:(telephoneCharges = telephoneCharges + count * 1.5));
    }
}
