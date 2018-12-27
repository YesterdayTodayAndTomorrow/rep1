package com.best;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Practice {

    public static void main(String[] args) {
/*        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.YEAR);
        System.out.println(i);
        long timeInMillis = calendar.getTimeInMillis();
        System.out.println("calendar"+timeInMillis);
        long l = System.currentTimeMillis();
        System.out.println("system"+l);*/
//        LocalDateTime ldf = LocalDateTime.now();
//        int year = ldf.getYear();
////        Month month = ldf.getMonth();
//        int monthValue = ldf.getMonthValue();
//        System.out.println(monthValue);

        // 格式化日期
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//        String format = sdf.format(new Date());
//        System.out.println(format);

//        // 获取昨天的当前时刻
//        Calendar calendar = Calendar.getInstance();
////        calendar.set(Calendar.DAY_OF_MONTH,-1);
//        calendar.add(Calendar.DATE , -1);
//        System.out.println(calendar.getTime());

        // 怎样将字符串转为基本数据类型
        Integer s = Integer.valueOf("123");
        System.out.println(s);

    }
}
