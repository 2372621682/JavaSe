package com.powernode.generics03;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //Integer,Double,Long...extends Number
        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.2);
    }
}
