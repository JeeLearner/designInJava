package com.design.observer.demo2_2;

import java.util.Map;

public interface Observer {
    public void execute(Map<String, Object> paras);
    public boolean isAsyn();
}

