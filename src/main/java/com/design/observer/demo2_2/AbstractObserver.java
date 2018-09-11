package com.design.observer.demo2_2;

import java.util.Map;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public abstract class AbstractObserver implements Observer {
    protected boolean asyn = false;

    @Override
    public boolean isAsyn() {
        return asyn;
    }

    public void setAsyn(boolean asyn) {
        this.asyn = asyn;
    }

}

