public class Test15 {
    public static void main(String[] args) {
        int i = 2;
        i = i + 2;//等同于 i += 2;

        byte b = 2;
        //b = b + 1;
        b += 1;//默认做了强制转换 等于 b = (byte)(b + 1);
        b = (byte)(b + 1);


    }
}
