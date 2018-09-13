package com.jdk8.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class _03DateParseFormat {

    public static void main(String[] args) {
        dateParseFormat();
    }

    public static void dateParseFormat(){
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today:" + today); //2018-09-13T09:23:03.788
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"))); //2018年09月13日
        System.out.println(today.format(DateTimeFormatter.BASIC_ISO_DATE)); //20180913

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now:" + now);
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:SS")));
        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));

        Instant timestamp = Instant.now();
        //default format
        System.out.println("Default format of Instant="+timestamp); //2018-09-13T01:39:22.871Z

        long epochSecond = Instant.now().getEpochSecond();
        System.out.println(epochSecond);
    }
}

