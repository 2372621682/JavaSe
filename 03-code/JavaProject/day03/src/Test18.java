public class Test18 {
    public static void main(String[] args) {
        /**
         * 1.数据类型
         *    1.基本类型
         *    2.引用类型（除去基本类型都是引用类型）
         * 2.字符串属于引用类型
         *    1.字面量必须添加双引号
         *    2.可以存储多个字符
         *    3.字符串包含的部分会原封不动输出
         *    4.字符串可以和其他任意的数据类型做 + 的操作，称为拼接
         *    5.字符串和其他数据类型 做 + 的操作 ，结果都是字符串
         *
         */
        String s1 = "abc";
        System.out.println(s1);//abc
        System.out.println("s1");//字符串包含的部分会原封不动输出
        System.out.println("s1 = " +  s1);//s1 = abc

        int a = 2, b = 3;
        System.out.println("a + b = " + a + b);//a + b = 23
        System.out.println("a + b = " + (a + b));//a + b = 5

        System.out.println("a" + 1 + 2);//a12
        System.out.println('a' + 1 + 2);//100
        byte b2 = 3;
        System.out.println("a" + true + 3 + b2);//atrue33

        int i = 2;
        byte b3 = 3;
        System.out.println("i = " + i);
        System.out.println("b3 = " + b3);//soutv :输出变量名拼接上变量值
    }
}
