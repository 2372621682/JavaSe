public class Test12 {
    public static void main(String[] args) {
        /**
         *   2. 不等于(!=)，等于等于(==)
         *   3. 逻辑与判断（&&），位与判断（&），逻辑或判断（||），位或判断（|）
         */
        boolean b;
        b = 2 != 3;
        System.out.println(b);//true
        b = 2 == 3;
        System.out.println(b);//false
        /**
         * 1. 逻辑与判断（&&），位与判断（&）区别：
         *    1.相同点
         *       1.都表示并且的意思
         *       2.条件表达式结果都为true，其结果才为true
         *       3.只要有一个为false，其结果就为false
         *    2.不同点
         *       1.&& ： 遇到表达式的结果为false，不再执行之后的表达式
         *       2.& :遇到表达式的结果为false，继续执行之后的表达式
         */
        System.out.println("============逻辑与判断（&&），位与判断（&）区别：==================");
        boolean flag = true;
        int x = 2, y = 3;
        flag = x > 2 && ++y > 3;//短路与
        System.out.println(flag);//false
        System.out.println(y);//3

        flag = x > 2 & ++y > 3;
        System.out.println(flag);//false
        System.out.println(y);//4
        /**
         * 1. 逻辑或判断（||），位或判断（|）
         *    1.相同点
         *       1.都表示或者的意思
         *       2.条件表达式结果只要有一个为true，其结果就为true
         *       3.表达式的结果都为false，其结果才为false
         *    2.不同点
         *       1.|| ： 遇到表达式的结果为true，不再执行之后的表达式
         *       2.| :遇到表达式的结果为true，继续执行之后的表达式
         */
        System.out.println("============逻辑或判断（||），位或判断（|）：==================");
        int m = 2, n = 3;
        flag = m == 2 || ++n == 3;// || 也称为短路或
        System.out.println(flag);//true
        System.out.println(n);//3

        flag = m == 2 | ++n == 3;
        System.out.println(flag);//true
        System.out.println(n);//4
    }
}
