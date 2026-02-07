package com.powernode.reader01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        try {
            //1.创建文件读取对象，并指定需要读取文件的路径
            FileReader fileReader = new FileReader("./day21/src/fileTest.txt");
            //2.读取文件，返回一个int类型的数据
            System.out.println(fileReader.read());//97 是 a 的ASCII
            System.out.println(fileReader.read());//98 是 b 的ASCII
            System.out.println(fileReader.read());//99 是 c 的ASCII
            System.out.println(fileReader.read());//-1 ,没有读取到数据
        } catch (FileNotFoundException e) {
            System.out.println("文件没有找到");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
