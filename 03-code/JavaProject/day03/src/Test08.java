public class Test08 {
    public static void main(String[] args) {
        //数据类型  变量名称  = 值;
        //Provided: 提供的，Required type:需要的类型
        //byte b = 128;
        byte b = 127;
        short s = 128;
        int i = 123;
        long l = 12345678901L;//12345678901l;
        /**
         * 1.Integer number too large : 整数太大
         * 2.分析原因
         *    1.右边给左边赋值，右边先开辟空间
         *    2.12345678901 默认开辟的空间是int类型，int类型的空间不足以存储12345678901，所以报错
         *    3.我们需要开辟一个long类型的空间来存储12345678901
         *    4. 那么就需要在字面值的后面添加L或者l
         *
         *
         */

    }

}
