package com.powernode.abstract03;


import java.io.File;

//文件处理类
abstract class FileProcessor{
    //定义一个文件处理流程（模版方法）
    public final void processFile(){
        //权限判断
        //1.打开文件
        openFile();
        //2.处理文件
        processContents();
        //3.关闭文件
        closeFile();
    }

    public abstract void processContents();


    public void openFile(){
        System.out.println("打开文件");
    }
    public void closeFile() {
        System.out.println("关闭文件");
    }
}
//统计文件行数
class LineCounter extends FileProcessor{

  /*  @Override
    public void processFile() {
        System.out.println("LineCounter.processFile");
    }*/

    @Override
    public void processContents() {
        System.out.println("只专注于统计行数");
    }
}
//统计文件字数
class WordCounter extends FileProcessor{

    @Override
    public void processContents() {
        System.out.println("只专注于统计文件字数");
    }
}


public class Test {
    public static void main(String[] args) {
        FileProcessor fileLineCounter = new LineCounter();
        fileLineCounter.processFile();

        FileProcessor fileWordCounter = new WordCounter();
        fileWordCounter.processFile();
    }
}
