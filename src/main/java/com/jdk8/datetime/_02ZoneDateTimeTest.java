package com.jdk8.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class _02ZoneDateTimeTest {

    public static void main(String[] args) {
        zonedDateTime();
    }

    public static void zonedDateTime(){
        // 获取当前时间日期
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1: " + date1); // date1: 2015-12-03T10:15:30+08:00[Asia/Shanghai]

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id); //Europe/Paris

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当前时区: " + currentZone); //Asia/Shanghai
    }

}

