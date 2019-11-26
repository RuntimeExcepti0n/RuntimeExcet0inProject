package com.dragon.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 时间，日期处理工具类
 */
public class DateTimeUtil {
    public static  final String DATE_AND_TIME_FORMAT = "yyyy-mm-dd hh:mm:ss";
    public static  final String DATE_FORMAT_CHINESS = "yyyy年MM月dd日";
    /**
     * 获取当前日期yyyy-MM-dd
     * @return
     */
    public static String getDate(){
        LocalDate now = LocalDate.now();
        return  now.toString();
    }

    /**
     * 获取当前日期，时间
     * @return
     */
    public static String getDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_AND_TIME_FORMAT);
        return localDateTime.format(formatter).toString();
    }
}
