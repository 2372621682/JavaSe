package com.powernode.reader01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.FileNotFoundException:文件没找到
         *    1.文件不存在
         *    2.路径错误
         * 2.绝对路径和相对路径
         *    1.绝对路径：从盘符开始到文件，看到路径就知道具体位置
         *        D:\powernode\02-JavaSE\03-code\JavaProject\day21\src\fileTest.txt
         *    2.相对路径：从当前模块到文件，看到路径不知道具体位置
         *        .\day21\src\fileTest.txt
         *        也可以写成（省略.\）
         *        day21\src\fileTest.txt
         */
        try {
            FileReader fileReader = new FileReader("day21/src/fileTest.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
