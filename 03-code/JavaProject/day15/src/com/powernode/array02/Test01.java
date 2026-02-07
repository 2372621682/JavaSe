package com.powernode.array02;


public class Test01 {
    public static void main(String[] args) {
        /**
         * 总结：
         *   1.需要查找的数设为x，中间值设为y
         *   2.如果 x == y :找到了
         *   3.如果 x > y :要查找的数在右半部分
         *      1.修改start=mid+1
         *      2.重新计算mid=(start+end)/2
         *   4.如果x < y :要查找的数在左半部分
         *      1.修改end=mid-1
         *      2.重新计算mid=(start+end)/2
         *   5.start > end :没找到
         */
        int[] ints = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //1.定义起始位置，和结束位置
        int start = 0;
        int end = ints.length - 1;
        //2.需要查找的数
        int num = 50;
        int index = binarySearch(ints, start, end, num);
        System.out.println("index = " + index);
    }

    /**
     * @param ints : 需要查找的数组
     * @param start：数组的起始位置
     * @param end：数组的结束位置
     * @param num：需要查找的数
     * @return：返回下标
     */
    public static int binarySearch(int[] ints, int start, int end, int num) {
        int mid = (start + end) / 2;
        while(start <= end){//start > end :没找打，所以start <= end 一直找
            if (num == ints[mid]) {//如果 x == y :找到了
                return mid;//返回索引
            }else if (num > ints[mid]){ // 如果x > y ,右半部分
                //1.修改start=mid+1
                start = mid + 1;
                //2.重新计算mid=(start+end)/2
                mid = (start + end) / 2;
            }else{
                //1.修改end=mid-1
                end = mid - 1;
                //2.重新计算mid=(start+end)/2
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
}
