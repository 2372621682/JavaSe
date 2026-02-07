package com.powernode.backup03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Student implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Student.close");
    }
}
public class Test02 {
    public static void main(String[] args) {
        /**
         * - 文件备份，copy一个副本
         *    1.读取文件
         *    2.创建目标文件
         *    3.写入目标文件
         */
        //1.确定读写文件路径
        String sourcePath = "./day21/src/com/powernode/backup03/Test01.java";
        String targetPath = sourcePath + ".bak";
        try (
                //1.try()创建文件读写对象，try执行完毕最后会自动调用close方法关闭资源
                FileReader fileReader = new FileReader(sourcePath);
                FileWriter fileWriter = new FileWriter(targetPath);
                /**
                 * try() 中创建的对象，该类必须实现AutoCloseable
                 * 重新AutoCloseable的close() 方法会自动执行
                 */
                Student student = new Student();
        ){
                //创建字符数组作为缓存
            char[] cbuf = new char[2];
            //读取文件
            int read = fileReader.read(cbuf);
            while(read != -1){
                //写入文件
                fileWriter.write(cbuf,0,read);
                read = fileReader.read(cbuf);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
