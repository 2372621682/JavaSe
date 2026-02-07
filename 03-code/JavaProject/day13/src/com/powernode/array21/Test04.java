package com.powernode.array21;

public class Test04 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        /**
         * 1.System.arraycopy():JDK提供的方法
         * 2.学习方法的方法
         *    1.是否为静态
         *    2.返回类型
         *    3.方法参数：
         *       1.Object src ：源数组
         *       2.int  srcPos：源数组的起始位置
         *       3.Object dest：目标数组
         *       4.int destPos：目标数组的起始位置
         *       5.int length：需要赋值的元素个数
         */
        int[] newInts = new int[ints.length << 1];
        //
        //System.arraycopy(ints,0,newInts,0,ints.length);
        System01.arraycopy(ints,0,newInts,0,3);

        for (int anInt : newInts) {
            System.out.println(anInt);
        }
    }


}
class System01{
    public static void arraycopy01(Object src,Object desc,int length){
        //检查源数组和目标数组是否为null
        if (src == null || desc == null) {
            System.out.println("源数组和目标数组都不能为null");
            return;
        }
        //检查src 和 desc 是否为数组类型
        if (!src.getClass().isArray() || !desc.getClass().isArray()) {
            System.out.println("源数组和目标数组都必须是数组");
            return;
        }
        //判断源数组和目标数组是否为int[]
        if (src instanceof int [] && desc instanceof int []) {
            int [] ints = (int[]) src;
            int[] newInts = (int[]) desc;
            for (int i = 0; i < length; i++) {
                newInts[i] = ints[i];
            }
        }

    }

    /**
     * @param src : 源数组
     * @param srcPos ： 起始位置
     * @param desc ： 目标数组
     * @param destPos：起始位置
     * @param length：copy元素的个数
     */
    public static void arraycopy(Object src,int srcPos,Object desc,int destPos,int length){
        //检查源数组和目标数组是否为null
        if (src == null || desc == null) {
            System.out.println("源数组和目标数组都不能为null");
            return;
        }
        //检查src 和 desc 是否为数组类型
        if (!src.getClass().isArray() || !desc.getClass().isArray()) {
            System.out.println("源数组和目标数组都必须是数组");
            return;
        }
        //判断源数组和目标数组是否为int[]
        if (src instanceof int [] && desc instanceof int []) {
            int [] ints = (int[]) src;
            int[] newInts = (int[]) desc;
            for (int i = 0; i < length; i++) {
                newInts[destPos++] = ints[srcPos++];
            }
        }

    }
}
