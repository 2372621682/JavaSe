package com.powernode.exercise01;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        double kilometer = new Scanner(System.in).nextDouble();
        //定义一个变量存储费用
        double money = 8;
        //超出的公里数
        int count = 0;
        if (kilometer > 3) {
            if (kilometer % 1 == 0) {//整公里数
                count = (int)kilometer - 3;
            }else{//不是整公里数
                //count = (int)kilometer - 3 + 1;
                count = (int)kilometer - 2;
            }
        }
        //总费用 = 前三公里的 + 超出的公里数 * 2.3
        money = money + count * 2.3;
        System.out.println(kilometer ==0 ? 0 : money);
    }
}

