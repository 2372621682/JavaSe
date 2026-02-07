package com.powernode.generics06;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

    }

    /**
     * 1.T和E 只能限定一种数据类型
     * 2.？数据类型不确定，可以限定多种数据类型（Integer,Double）
     * 3.如果方法返回一个集合，但是这个集合中的数据不确定，可以使用？
     */
    public static List<?> method(boolean flag){
        if (flag) {
            return new ArrayList<Integer>();
        }
        return new ArrayList<Double>();
    }
}
