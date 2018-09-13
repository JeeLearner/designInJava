package com.jdk8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/11
 * @Version:v1.0
 */
public class TestSort {

    public static void main(String[] args) {
        TestSort testSort = new TestSort();
        List<String> list = testSort.getList();
        System.out.println(list);

        System.out.println("---------使用 Java 7 语法: ");
        testSort.sortByJava7(list);
        System.out.println(list);

        System.out.println("---------使用 Java 8 语法: ");
        testSort.sortByJava8(list);
        System.out.println(list);
        list.stream().forEach(str -> System.out.println(str));
    }

    // 使用 java 7 排序
    private void sortByJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    // 使用 java 8 排序
    private void sortByJava8(List<String> names){
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
    }




    private List<String> getList(){
        List<String> names = new ArrayList<String>();
        names.add("Google ");
        names.add("Runoob ");
        names.add("Taobao ");
        names.add("Baidu ");
        names.add("Sina ");
        return names;
    }
}

