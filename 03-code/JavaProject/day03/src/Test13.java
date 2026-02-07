public class Test13 {
    public static void main(String[] args) {
        /**
         * 1. 语法：<条件表达式>?<表达式1>:<表达式2>
         * 2. 执行过程：
         *   1. <条件表达式>
         *     1. true: 返回 <表达式1>的结果
         *     2. false: 返回 <表达式2>的结果
         */
        int x = 2,y = 3;
        int max = x > y ? x : y;
        System.out.println(max);//3

        int m = 2,n = 3;
        /**
         * 1.++m：m=3
         * 2.m+1: 3 + 1 = 4
         * 3.4 > n : 4 > 3 :true
         * 4.把m的值赋值给max：max = 3;
         * 5.m++,m = 4;
         */
        max = ++m + 1 > n ? m++ : n++;
        System.out.println(max);//3
        System.out.println(m);//4
    }
}
