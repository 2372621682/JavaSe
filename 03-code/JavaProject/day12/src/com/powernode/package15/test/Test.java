package com.powernode.package15.test;


//1.导入方式（一）：包名 + 类名
import com.powernode.package15.model.Bird;
/*import com.powernode.package15.itf.Flyer;
import com.powernode.package15.itf.Swimming;*/
//2.导入方式（二）：包名 + *（*代表包下所有的成员）
import com.powernode.package15.itf.*;
public class Test {
    public static void main(String[] args) {
        Flyer flyer = new Bird();
        Swimming swimming = new Bird();
        //3.导入方式（三）:使用类是直接带上包名
        com.powernode.package15.amodel.Pet pet = new Bird();
    }
}
