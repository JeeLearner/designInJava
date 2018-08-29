package com.design.template.demo2_2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: TestServlet类是HttpServlet类的子类，并且置换掉了父类的两个方法：doGet()和doPost()。
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class TestServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("using the GET method");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("using the POST method");
    }

}

