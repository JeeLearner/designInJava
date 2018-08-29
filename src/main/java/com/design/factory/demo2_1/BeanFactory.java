package com.design.factory.demo2_1;

import java.util.concurrent.ExecutionException;

public interface BeanFactory {
    Object getBean(String id) throws ExecutionException;
}
