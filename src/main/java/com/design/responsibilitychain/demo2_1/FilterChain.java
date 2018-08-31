package com.design.responsibilitychain.demo2_1;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface FilterChain {

    public void doFilter(ServletRequest request, ServletResponse response);
}
