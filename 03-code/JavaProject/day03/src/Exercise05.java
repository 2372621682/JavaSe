public class Exercise05 {
    public static void main(String[] args) {
        /**
         * 1.-- 自减1，如果变量为3 ，那么自减1后，结果为 2
         * 2. -- 又分为 ，前--，和后--
         *    1.前--，--在变量的前面
         *    2.后--，--在变量的后面
         * 3.前 -- 和后 -- 的区别
         *    1.前--，先自减1，后运算或输出
         *    2.后--，先运算或输出，后自减1
         */
        int x = 2, y = 3;
        System.out.println(--x);//1
        System.out.println(x);//1

        System.out.println(y--);//3
        System.out.println(y);//2
    }
}
