package com.design.memento.demo1_2;

import com.design.memento.demo1_1.EmpOriginator;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/13
 * @Version:v1.0
 */
public class Test01 {

    public static void main(String[] args) {
        CareTaker taker = new CareTaker();//构建一个备忘录管理者
        //构建发起人
        EmpOriginator emp = new EmpOriginator("张三", 20, 4000);
        System.out.println("第一次："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第1次备份
        taker.mementoEmp(emp.memento());

        //备份完了后再修改
        emp.setEname("李四");
        emp.setAge(30);
        emp.setSalary(50000);
        //然后再次打印
        System.out.println("1修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第2次备份
        taker.mementoEmp(emp.memento());

        //备份完了后再修改
        emp.setEname("李四2");
        emp.setAge(32);
        emp.setSalary(52000);
        //然后再次打印
        System.out.println("2修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第3次备份
        taker.mementoEmp(emp.memento());

        //备份完了后再修改
        emp.setEname("李四3");
        emp.setAge(33);
        emp.setSalary(32000);
        //然后再次打印
        System.out.println("3修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
        //第4次备份
        taker.mementoEmp(emp.memento());

        //当然，也可以恢复之后把它从栈中删除。
        //测试：恢复之前从栈中删除两个最近的数据
        taker.getEmpForStackAndRemove();//删除最近一次的备份
        taker.getEmpForStackAndRemove();//删除最近一次的备份

        //开始恢复
        emp.recovery(taker.getEmpForStack());//恢复的是第4次备份的数据（3修改后）
        System.out.println("恢复后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
    }
}

