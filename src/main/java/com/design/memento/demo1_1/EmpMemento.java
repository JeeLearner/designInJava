package com.design.memento.demo1_1;

/**
 * @Description: 备忘录对象
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class EmpMemento {
    //自身属性
    private String ename;
    private int age;
    private double salary;
    //构造备忘录对象时，需要传入一个需要备忘的对象（发起人）
    public EmpMemento(EmpOriginator emp){
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

