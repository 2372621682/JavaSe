public class Test10 {
    public static void main(String[] args) {
        //数据类型 变量名称 = 值;
        /**
         * 1.char 只能存储单个字符
         * 2.char 字面值添加单引号
         * 3.char的默认值,比较特殊，按照16进制进行处理
         * 4.char类型的数据对应的有ASCII码
         */
        char c1 = '中';
        char c2 = '\u0000';//char的默认值,比较特殊，按照16进制进行处理
        char c3 = 'b';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        char c4 = 97;
        System.out.println(c4);//输出的是a，因为a的ASCII码是97

        char c5 = 98;
        System.out.println(c5);//b


    }

}
