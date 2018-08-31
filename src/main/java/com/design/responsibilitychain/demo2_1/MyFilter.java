package com.design.responsibilitychain.demo2_1;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
    具体的Filter
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        //处理request和response
        //...
        chain.doFilter(request,response);
    }
}

