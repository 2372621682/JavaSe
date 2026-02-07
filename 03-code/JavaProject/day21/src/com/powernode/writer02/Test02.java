package com.powernode.writer02;

import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        //1.确定文件写入路径
        String path = "./day21/src/fileTest.txt";
        FileWriter fileWriter = null;
        try {
            //2.创建文件写入对象，并建立写入通道
            fileWriter = new FileWriter(path);
            /**
             * 3.写入文件:
             *    1.清空文件
             *    2.写入缓存（通道）
             */
            fileWriter.write("下班去哪里玩？");
            //刷新缓存，写入硬盘
            fileWriter.flush();
            fileWriter.write("去后海吧！");
            fileWriter.flush();
            /**
             * 若需要【立即写入】数据且继续使用流，必须调用flush()。
             * 若操作结束要关闭流，close()会自动处理 flush，无需额外调用。
             * 对于带缓冲的流，仅靠close()虽然能保证最终数据写入，但无法满足实时性要求（如网络通信、实时日志）。
             */
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
