package com.springmvc.user;

import com.springmvc.support.annotation.Qualifier;
import com.springmvc.support.annotation.Service;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/20
 * @Version:v1.0
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Qualifier
    private UserDao userDao;

    @Override
    public void insert() {
        userDao.insert();
    }
}

