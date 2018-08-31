package com.design.responsibilitychain.demo2_1;

import org.apache.catalina.core.ApplicationFilterConfig;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/31
 * @Version:v1.0
 */
public class ApplicationFilterChain implements FilterChain {
    //所创建的ApplicationFilterConfig数组长度为零，在执行addFilter时会被重新赋值
    private ApplicationFilterConfig[] filters = new ApplicationFilterConfig[0];
    private int pos = 0;//维持过滤器链中的当前位置
    private int n = 0;//过滤器链中的过滤器数量

    @Override
    public void doFilter(ServletRequest request, ServletResponse response) {
        internalDoFilter(request,response);
    }

    private void internalDoFilter(ServletRequest request, ServletResponse response) {
        if(pos < n) {
            ApplicationFilterConfig filterConfig = filters[pos++];
            //暂时报错先注释
            //Filter filter = filterConfig.getFilter();
            //filter.doFilter(request, response, this);
            return;
        }
    }

    void addFilter(ApplicationFilterConfig filterConfig) {
        //省略了扩容部分。。。
        filters[n++] = filterConfig;
    }
}

