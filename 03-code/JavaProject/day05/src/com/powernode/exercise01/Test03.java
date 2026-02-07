package com.powernode.exercise01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        double temperature = new Scanner(System.in).nextDouble();
        /*if (temperature > 36.5 && temperature < 40)
            System.out.println("发烧");
        else if (temperature >= 40)
            System.out.println("请立即就医，避免发生意外");
        else
            System.out.println("注意多喝开水");
*/
        String info = temperature > 36.5 && temperature < 40 ? "发烧" :
                temperature >= 40 ? "请立即就医，避免发生意外" : "注意多喝开水";
        System.out.println(info);

    }
}

