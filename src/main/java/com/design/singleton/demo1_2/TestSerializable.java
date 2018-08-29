package com.design.singleton.demo1_2;

import java.io.*;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class TestSerializable {

    public static void main(String[] args) throws Exception {
        StaticSingleton2 s1 = StaticSingleton2.getInstance();
        StaticSingleton2 s2 = StaticSingleton2.getInstance();

        //通过反序列化构建对象：通过序列化将s1存储到硬盘上，然后再通过反序列化把s1再构建出来
        FileOutputStream fos = new FileOutputStream("e:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();
        //通过反序列化将s1对象再构建出来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
        StaticSingleton2 s5 = (StaticSingleton2) ois.readObject();
        System.out.println(s5);//此时打印出一个新对象
        System.out.println(s1==s5);//false
    }

    /**
     *
     * 反序列化时，如果定义了readResolve()则直接返回该方法指定的实例。不会再单独创建新对象！
     * @return
     * @throws ObjectStreamException
     */
    /*
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
     */
}

