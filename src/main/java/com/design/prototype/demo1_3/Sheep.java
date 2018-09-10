package com.design.prototype.demo1_3;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/10
 * @Version:v1.0
 */
public class Sheep implements Serializable {

    private String sname;
    private Date birthday;

    public Sheep(String name, Date date) {
        this.sname = name;
        this.birthday = date;
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

