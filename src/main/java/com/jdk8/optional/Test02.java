package com.jdk8.optional;

import java.util.Optional;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/12
 * @Version:v1.0
 */
public class Test02 {

    public static void main(String[] args) {
        Optional<String> ret = getString("sss");
        //直接打印会报异常
        //System.out.println(ret.get());
        if (ret.isPresent()) {
            System.out.println(ret.get());
        }
        // 也可以不判断 使用orElse，会有默认值
        System.out.println(ret.orElse("VALUE IS NULL"));
    }

    public static Optional<String> getString(String str){
        String str1 = null;
        if(str.equals("Haha")){
            str1 = "Haha";
        }
        Optional<String> ret = Optional.ofNullable(str1);
        return ret;
    }
}

