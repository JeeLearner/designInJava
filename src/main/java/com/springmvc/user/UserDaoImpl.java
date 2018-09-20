package com.springmvc.user;

import com.springmvc.support.annotation.Repository;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/20
 * @Version:v1.0
 */
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("execute UserDaoImpl");
    }
}

