package com.design.responsibilitychain.demo2_1;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
    Filter接口是所有具体过滤器必须实现的接口，
    该接口有一个核心的方法doFilter，方法对Request和Response进行处理，
    注意第三个参数类型为FilterChain，传入该参数的目的是为了责任能够传递到下一个过滤器。
 */
public interface Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain);
}

