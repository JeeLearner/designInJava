package com.design.composite.demo1_2;

/**
 * 抽象构件：定义了公共功能
 * @auther: lyd
 * @date: 2018/9/3 10:26
 */
public abstract class Market {
	protected String name;
	public Market(String name){
		super();
		this.name = name;
	}

 
	public abstract void add(Market m);

	public abstract void remove(Market m);

	public abstract void payByCard();
	}