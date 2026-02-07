package com.powernode.package16;
//静态导入：所导入的成员必须是静态的
/*import static com.powernode.package16.tools.IMath.PI;
import static com.powernode.package16.tools.IMath.cleArea;*/

import static com.powernode.package16.tools.IMath.*;

public class Test02 {
    public static void main(String[] args) {
        //静态导入可读性差，在实际的开发过程中使用不多
        System.out.println(PI);
        System.out.println(cleArea(10));
    }
}
