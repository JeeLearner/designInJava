package com.design2.iterator.demo1_1;

/**
 * 定义一个迭代器的抽象，这里使用接口定义
 * @auther: lyd
 * @date: 2018/9/13 16:35
 */
public interface MyIterator {
    void first();//将游标指向第一个元素
    void next();//将游标指向下一个元素
    boolean hasNext();//判断是否有下一个元素

    boolean isFirst();//判断是否是第一个元素
    boolean isLast();//判断是否是最后一个元素
    Object getCurrentObj();//获取当前对象
}

