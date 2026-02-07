public class Test13 {
    public static void main(String[] args) {
        // 直接赋值（=），复合赋值（+=，-=，*=，/=,%=）
        int x = 2;
        //x = x + 3;
        x+=3;//等同于 x = x + 3;
        System.out.println(x);//5

        int y = 2;
        y -= 1;
        System.out.println(y);//1

        int m = 3;
        m *= 2;
        System.out.println(m);//6

        int n = 10;
        n /= 3;
        System.out.println(n);//3

        int z = 10;
        z %= 3;
        System.out.println(z);//1


    }
}
