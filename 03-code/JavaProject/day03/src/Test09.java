public class Test09 {
    public static void main(String[] args) {
        //数据类型 变量名称 = 值;
        /**
         * 1.float :字面值
         *   1.添加f;
         *   2.添加F;
         * 2.double :字面值
         *   1.添加d;
         *   2.添加D;
         *   3.怎么都不添加
         */
        float f1 = 1.2f;
        float f2 = 1.2F;

        double d1 = 1.2d;
        double d2 = 1.2D;
        double d3 = 1.2;

        //float f3 = 1.2; 报错，因为1.2默认double类型
        float f4 = 123L;
        /*long l = 1.2f;报错，因为float表示的范围比long大*/

        //byte < short < int < long < float < double


    }

}
