package com.design.factory.demo2_1;

import com.design.factory.demo2_1.entity.Car;
import org.dom4j.DocumentException;

import java.util.concurrent.ExecutionException;

public class BeanFactoryTest {

    public static void main(String[] args) throws Exception, DocumentException, ExecutionException {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("factory_spring.xml");
        Object obj = beanFactory.getBean("car");
        Car car = (Car)obj;
        car.run();
    }

}