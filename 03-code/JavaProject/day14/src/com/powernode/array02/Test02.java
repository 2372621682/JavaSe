package com.powernode.array02;

public class Test02 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        /**
         * 1.删除下标为 3 的元素 4
         * 2.删除后的结果为：{1, 2, 3, 5, 6};
         * 3.删除步骤：
         *    1.创建一个新的数组，长度为老数组长度 - 1
         *       {0, 0, 0, 0, 0};
         *    2.把数组的前3个元素放入新数组
         *       {1, 2, 3, 0, 0};
         *    3.把数组的后2个元素放入新数组
         *       {1, 2, 3, 5, 6};
         */
        ints = deleteElementByIndex(ints, 3);
        for (int num : ints) {
            System.out.print(num + "\t");
        }
    }

    /**
     *
     * @param ints : 源数组
     * @param index：需要删除的索引
     * @return
     */
    public static int [] deleteElementByIndex(int [] ints,int index){
        //1.创建一个新的数组，长度为老数组长度 - 1
        int[] newInts = new int[ints.length - 1];
        //2.把数组的前3个元素放入新数组
        System.arraycopy(ints,0,newInts,0,index);
        //3.把数组的后2个元素放入新数组
        System.arraycopy(ints,index + 1,newInts,index,ints.length - index - 1);
        /**
         * 老数组：{1, 2, 3, 4, 5, 6};
         *  下标： 0   1  2  3  4  5
         *  1.删除下标为 2 的元素：后面还有  3 个元素 ： 6 - 2 - 1 = 3
         *  2.删除下标为 3 的元素：后面还有  2 个元素 ： 6 - 3 - 1 = 2
         *  3.删除下标为 4 的元素：后面还有  1 个元素 ： 6 - 4 - 1 = 1
         *  总结：ints.length - index - 1
         */
        return newInts;
    }
}
