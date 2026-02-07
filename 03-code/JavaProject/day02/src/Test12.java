public class Test12 {
    public static void main(String[] args) {
        //正（+），负（-），前后递增（++），前后递减（--）
        int x = 2 ,y = 3;
        System.out.println(+x);//2
        System.out.println(-y);//-3
        System.out.println("--------------");

        /**
         * 前后递增（++）
         * 1. ++ 自增1，如果变量为2，那么自增1后的结果是3
         * 2. ++ 又分为前 ++ 和 后 ++
         *    1.前++，++在变量的前面
         *    2.后++，++在变量的后面
         * 3.前++和后++的区别
         *    1.前++，先自增1，后运算或者输出
         *    1.后++，先运算或者输出，后自增1
         *
         */
        int m = 2, n = 3;
        //m = m + 1;
        System.out.println(++m);//3
        System.out.println(m);//3
        System.out.println(n++);//3
        System.out.println(n);//4
        System.out.println("--------------");
        int i = 2;
        int j = 3;
        int z = ++i;//i = i + 1
        System.out.println(z);//3
        System.out.println(i);//3

        z = i ++;
        System.out.println(z);//3
        System.out.println(i);//4
        /**
         * 伪代码
         *   int temp = i;//把i的值 4 赋值给 temp
         *   i = i + 1； i = 5；
         *   i = temp ; 把临时变量的值赋值给了i，所以最终i的值还是 4
         */
        i = i ++;
        System.out.println(i);//4

        z = i++ + 1;
        /**
         * 执行过程：
         *    1.i + 1 先运算，4 + 1
         *    2.把i + 1的结果赋值给z
         *    3.i 自增1，i = 5
         */
        System.out.println(z);//5
        System.out.println(i);//5

        z = ++i + 1;
        /**
         * 执行过程
         *   1.i先自增1,i = 6
         *   2.i + 1 ,6 + 1 : 7
         *   3.把7赋值给z
         */
        System.out.println(z);//7
        System.out.println(i);//6

        i = 5;
        int num = ++i + i++ * --i;
        /**
         * 分步计算：
         *   1.++i ；i 先变为 6，此时表达式：6 + i++ * --i;
         *   2.i++ ; 先使用i的值参与乘法运算，然后i再变为7，此时表达式： 6 + 6++ * --i;
         *   3.--i ; i先变为6，然后再参与乘法运算：此时表达式 6 + 6 * 6;
         *   4.最终 6 + 36 = 42
         *   5.i最终 = 6
         */
        System.out.println(num);//42
        System.out.println(i);//6


    }
}
