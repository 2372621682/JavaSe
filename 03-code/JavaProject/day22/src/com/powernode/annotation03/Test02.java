package com.powernode.annotation03;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

       // List<Integer> list = new ArrayList<>();
        /**
         * 1.@SuppressWarnings("rawtypes"),表示当前代码中，忽略所有泛型警告
         * 2.@SuppressWarnings("unchecked"),表示当前代码中，忽略所有未检查的转换警告
         * 3.@SuppressWarnings("all"),表示当前代码中，忽略所有警告
         * 4.@SuppressWarnings("unused"),表示当前代码中，忽略所有未使用的变量警告
         * 5.@SuppressWarnings("deprecation"),表示当前代码中，忽略所有过时的API警告
         * 6.@SuppressWarnings("serial"),表示当前代码中，忽略所有序列化警告
         * ....
         */
        //抑制警告
        @SuppressWarnings("rawtypes")
        List list = new ArrayList();
    }
}
