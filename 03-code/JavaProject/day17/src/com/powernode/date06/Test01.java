package com.powernode.date06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 日期类：年月日,时分秒，星期，上午下午
         */
        //1.创建日期对象
        Date date = new Date();
        System.out.println(date);//Sat Aug 09 14:07:26 CST 2025
        //2.创建日期格式化对象，并指定格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss SSS E");
        //3.通过指定的格式对当前日期对象格式化
        System.out.println(simpleDateFormat.format(date));//2025-08-09 下午 14:10:53 428 周六
        //4.今天是一年中的第几天
        simpleDateFormat = new SimpleDateFormat("DDD");
        System.out.println(simpleDateFormat.format(date));
        System.out.println("-----------");
        //1.获得日历对象
        Calendar instance = Calendar.getInstance();
        //2.通过日历对象获得当前时间
        Date time = instance.getTime();
        System.out.println(time);
        //3.创建日期格式化对象，并指定格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss SSS E");
        //4.通过指定的格式对当前日期对象格式化
        System.out.println(dateFormat.format(date));
        //5.今天是一年当中的第几天
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
    }
}
