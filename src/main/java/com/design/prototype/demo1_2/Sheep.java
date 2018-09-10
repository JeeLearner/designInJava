package com.design.prototype.demo1_2;

import java.util.Date;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class Sheep implements Cloneable {

    private String sname;
    private Date birthday;

    public Sheep(String name, Date date) {
        this.sname = name;
        this.birthday = date;
    }

    /**
     * 重写Object对象的clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object对象的clone方法
        Object obj = super.clone();
        Sheep s = (Sheep) obj;
        //深克隆：把对象下的所有属性也克隆出来;
        s.birthday = (Date)this.birthday.clone();
        return obj;
    }


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

