package com.powernode.bufferandbuilder05;

public class Test02 {
    public static void main(String[] args) {
        /**
         * new StringBuffer()	定义一个空的字符串缓冲区，含有16个字符的容量
         * new StringBuffer(5);	定义一个含有5个字符容量的字符串缓冲区
         * new StringBuffer("天方地圆");	 定义一个含有(16+4)的字符串缓冲区，"天方地圆"为4个字符
         * int capacity()	capacity()方法返回字符串的容量大小
         * void trimToSize()	该方法的作用是将StringBuffer对象的中存储空间缩小到和字符串长度一样的长度，减少空间的浪费。
         * StringBuffer append(String str)	向 StringBuffer 对象追加 str 字符串到末尾处
         * StringBuffer insert(int offset, String str)	在指定位置把字符串数据插入到字符串缓冲区里面，并返回字符串缓冲区本身
         */
        StringBuffer sb = new StringBuffer();//定义一个空的字符串缓冲区，含有16个字符的容量
        System.out.println("sb.capacity() = " + sb.capacity());//16
        StringBuffer sb1 = new StringBuffer(5);
        System.out.println("sb1.capacity() = " + sb1.capacity());//5
        StringBuffer sb2 = new StringBuffer("中国你好");
        System.out.println("sb2.capacity() = " + sb2.capacity());//20
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());//4
        StringBuffer sb3 = new StringBuffer("伟大祖国");
        sb3.append(",未来更好");
        System.out.println(sb3);//伟大祖国,未来更好
        System.out.println("sb3.insert(2,6) = " + sb3.insert(2, 6));//伟大6祖国,未来更好
        /**
         * void setCharAt(int index, char ch)	方法用于在字符串的指定索引位置替换一个字符
         * StringBuffer replace(int start, int end, String str)	把[start,end)区间的字符串替换为str
         * StringBuffer reverse()	对字符串进行反转
         * StringBuffer deleteCharAt(int index)	移除序列中指定位置的字符
         * StringBuffer delete(int start, int end)	start 表示要删除字符的起始索引值（包括索引值所对应的字符），end 表示要删除字符串的结束索引值（不包括索引值所对应的字符）
         * String substring(int start) 	截取字符串从第[start 位开始到最后
         * String substring(int start, int end)	截取字符串从第[start,end)结束
         */
        System.out.println(sb3);//伟大6祖国,未来更好
        sb3.setCharAt(2,'的');
        System.out.println(sb3);//伟大的祖国,未来更好
        sb3.replace(0, 3, "*");//*祖国,未来更好
        System.out.println(sb3);
        System.out.println("sb3.reverse() = " + sb3.reverse());//好更来未,国祖*
        System.out.println(sb3.deleteCharAt(0));//更来未,国祖*
        System.out.println("sb3.delete(0,3) = " + sb3.delete(0, 3));//,国祖*

        StringBuffer sb4 = new StringBuffer("伟大的祖国,未来更好");
        System.out.println("sb4.substring(1) = " + sb4.substring(1));//"大的祖国,未来更好"
        System.out.println(sb4);//伟大的祖国,未来更好
        System.out.println("sb4.substring(3,5) = " + sb4.substring(3, 5));//祖国


    }
}
