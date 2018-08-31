package com.design.responsibilitychain.demo2_1.myfilter;

import com.design.responsibilitychain.demo2_1.Filter;
import com.design.responsibilitychain.demo2_1.FilterChain;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
    具体的Filter
 */
public class MyFilter3 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        //处理request和response
        //...
        chain.doFilter(request,response);
    }
}

