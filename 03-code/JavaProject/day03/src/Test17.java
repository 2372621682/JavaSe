public class Test17 {
    public static void main(String[] args) {
        //byte < short < int < long < float < double
        float f1 = 0.85f,f2 = 0.1f;
        float f3 = f1 +f2;
        System.out.println(f3);//0.95000005 ,因为小数表示的是近似值

        double d1 = 0.85,d2 = 0.1;
        double d3 = d1 +d2;
        System.out.println(d3);//0.95
    }
}
