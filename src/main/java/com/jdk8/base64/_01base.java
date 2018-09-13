package com.jdk8.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class _01base {

    public static void main(String[] args) {
        try {
            String base64encodedString = Base64.getEncoder().encodeToString("test?java8".getBytes());
            System.out.println("Base64 编码字符串 (基本) :" + base64encodedString);
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
            System.out.println("Base64 解码字符串（基本）:" + new String(base64decodedBytes, "utf-8"));

            base64encodedString = Base64.getUrlEncoder().encodeToString("test?java8".getBytes());
            System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);
            byte[] decode = Base64.getUrlDecoder().decode(base64encodedString);
            System.out.println("Base64 解码字符串（URL）:" + new String(decode, "utf-8"));

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }
            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


}

