package com.jdk8.datetime;

import java.time.*;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/12
 * @Version:v1.0
 */
public class _01LocalDateTimeTest {

    public static void main(String[] args) {
        localDateTime();
    }

    public static void localDateTime(){
        //获取当前日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime); //2018-09-12T17:37:37.824

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1); //2018-09-12

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds); //月: SEPTEMBER, 日: 12, 秒: 37

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2); //2012-09-10T17:37:37.824

        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3); //2014-12-12

        LocalDate date6 = LocalDate.ofYearDay(2014, 100);
        System.out.println("2014年第100天的日期："+date6); //2014-04-10

        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4); //22:15

        LocalTime ofSecondOfDay = LocalTime.ofSecondOfDay(10000);
        System.out.println("第10000秒的时间：" + ofSecondOfDay); //02:46:40

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5); //20:15:30
    }
}

