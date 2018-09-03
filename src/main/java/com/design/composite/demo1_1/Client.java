package com.design.composite.demo1_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/3
 * @Version:v1.0
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        Composite comp2 = new Composite("Composite Y");
        comp2.add(new Leaf("Leaf YA"));
        comp2.add(new Leaf("Leaf YB"));
        comp.add(comp2);

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        //  root.remove(leaf);//这里可以删除某节点

        root.display(1);
    }
}

