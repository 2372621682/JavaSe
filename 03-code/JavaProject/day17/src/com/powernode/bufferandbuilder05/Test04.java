package com.powernode.bufferandbuilder05;
//定义一个任务接口
interface Task{
    //测量耗时的方法
    static long measureTask(Task task){
        //1.开始计时
        long start = System.currentTimeMillis();//获得时间的毫秒数
        //2.字符串处理
        task.performTask();
        //3.结束计时
        long end = System.currentTimeMillis();//获得时间的毫秒数
        //4.耗时：结束时间 - 开始时间
        return  end - start;
    }

    //执行具体任务的方法
    void performTask();
}

public class Test04 {
    public static void main(String[] args) {
        int count = 150000;
        testString(count);
        testStringBuffer(count);
        testStringBuilder(count);
        /**
         * String耗时：6209毫秒
         * StringBuffer耗时：5毫秒
         * StringBuilder耗时：4毫秒
         */
    }

    private static void testString(int count) {
        long time = Task.measureTask(new Task() {
            String s = new String();
            @Override
            public void performTask() {
                for (int i = 0; i < count; i++) {
                    s += i;
                }
            }
        });
        System.out.println("String耗时：" + time + "毫秒");
    }
    //线程安全，效率较低
    private static void testStringBuffer(int count) {
        long time = Task.measureTask(new Task() {
            StringBuffer sb = new StringBuffer();
            @Override
            public void performTask() {
                for (int i = 0; i < count; i++) {
                    sb.append(i);
                }
            }
        });
        System.out.println("StringBuffer耗时：" + time + "毫秒");
    }
    //非线程安全，效率较高
    private static void testStringBuilder(int count) {
        long time = Task.measureTask(new Task() {
            StringBuilder sb = new StringBuilder();
            @Override
            public void performTask() {
                for (int i = 0; i < count; i++) {
                    sb.append(i);
                }
            }
        });
        System.out.println("StringBuilder耗时：" + time + "毫秒");
    }
}
