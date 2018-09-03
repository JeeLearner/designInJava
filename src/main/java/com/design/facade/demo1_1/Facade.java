package com.design.facade.demo1_1;

import com.design.facade.demo0.SubSystemClass;
import com.design.facade.demo0.SubSystemClass2;
import com.design.facade.demo0.SubSystemClass3;

/**
 * @Description: 外观模式：封装子系统，对外提供一个门面方法
 * @Auther: lyd
 * @Date: 2018/9/3
 * @Version:v1.0
 */
public class Facade {

    //所有子系统的引用
    private SubSystemClass s1 = null;
    private SubSystemClass2 s2 = null;
    private SubSystemClass3 s3 = null;
    //构造子系统的引用
    public Facade() {
        this.s1 = new SubSystemClass();
        this.s2 = new SubSystemClass2();
        this.s3 = new SubSystemClass3();
    }

    /**
     * 具体的外观方法
     */
    public void facade(){
        s1.methodOne();
        s2.methodTwo();
        s3.methodThree();
    }
}

