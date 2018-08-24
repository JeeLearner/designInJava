package com.design.adapter.spring_demo1.adaptee;

/**
 * controller实现之一 annotationController
 * @auther: lyd
 * @date: 2018/8/23 17:57
 */
public class AnnotationController implements Controller {

    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }
}

