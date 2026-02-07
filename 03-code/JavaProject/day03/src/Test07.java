public class Test07 {
    public static void main(String[] args) {
        /**
         * 3 左移 1 位
         *   1. 3的二进制是 0000 0011
         *   2. 0000 0011 左移 1 位 后  0000 0110
         *   3. 110 ： 1 * 2^2 + 1 * 2^1 + 0 * 2^0
         *            = 4 + 2 + 0
         *            =6
         */
        System.out.println(3 << 1);// 6:左移1位，相当于乘以 2
        System.out.println(3 * 2);//6：为什么要左移，而不用乘法，因为位运算效率高
        /**
         * 3 右移 1 位
         *    1. 3的二进制是 0000 0011
         *    2. 0000 0011 右移 1 位  后  0000 0001
         *    3. 1
         */
        System.out.println(3 >> 1);//1
        System.out.println(8 << 1);//16
        System.out.println(8 >> 1);//4

        /**
         *  无符号右移 >>> 和 右移类似（忽略符号位）
         */
        System.out.println(6 >>> 1);
        //没有无符号左移，因为符号位在左边
        //System.out.println(6 <<< 1);

    }

}
