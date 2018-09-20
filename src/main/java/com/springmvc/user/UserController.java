package com.springmvc.user;

import com.springmvc.support.annotation.Controller;
import com.springmvc.support.annotation.Qualifier;
import com.springmvc.support.annotation.RequestMapping;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/20
 * @Version:v1.0
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/insert")
    public void insert(){
        userService.insert();
    }

}

