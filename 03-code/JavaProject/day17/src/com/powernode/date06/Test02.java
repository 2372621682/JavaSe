package com.powernode.date06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        //1.获得当前的时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //2.创建日期格式化对象，并指定格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss SSS E");
        //3.对当前日期进行格式
        System.out.println(dateTimeFormatter.format(now));
        //4.今天是一年当中的第几天
        System.out.println(now.getDayOfYear());
    }
}
