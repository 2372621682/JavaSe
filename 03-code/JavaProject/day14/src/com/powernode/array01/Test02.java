package com.powernode.array01;

public class Test02 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        insert(ints,3,6);
        for (int anInt : ints) {
            System.out.print(anInt + "\t");
        }
    }

    /**
     * @param ints : 源数组
     * @param index：需要插入的下标
     * @param num：需要插入的数据
     */
    public static void insert(int [] ints,int index,int num){
        /**
         * 1.向数组下标为3的元素插入6
         * 2.插入后的结果为：{1, 2, 3, 6, 4, 5};
         * 3.实施步骤：
         *     1.创建一个新的数组，新数组的长度是老数组的长度+1
         *           {0, 0, 0, 0, 0, 0};
         *     2.把老数组的前3个元素放入 新数组
         *           {1, 2, 3, 0, 0, 0};
         *     3.在新数组中下标为3的元素插入6
         *           {1, 2, 3, 6, 0, 0};
         *     4.再把老数组的后两位元素放入新数组
         *           {1, 2, 3, 6, 4, 5};
         */
        //1.创建一个新的数组，新数组的长度是老数组的长度+1
        int[] newInts = new int[ints.length + 1];//{0, 0, 0, 0, 0, 0};
        //2.把老数组的前3个元素放入 新数组
        System.arraycopy(ints,0,newInts,0,3);//{1, 2, 3, 0, 0, 0};
        //3.在新数组中下标为3的元素插入6
        newInts[3] = 6;//{1, 2, 3, 6, 0, 0};
        //4.再把老数组的后两位元素放入新数组
        System.arraycopy(ints,3,newInts,4,2);

        ints = newInts;
    }
}
