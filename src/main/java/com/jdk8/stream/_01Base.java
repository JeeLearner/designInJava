package com.jdk8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/12
 * @Version:v1.0
 */
public class _01Base {

    public static void main(String[] args) {
        //test();
        //testForeach();
        //testMap();
        //testFilter();
        //testLimit();
        //testSorted();
        //testParallel();
        //testCollectors();
        testTongji();
    }

    public static void test(){
        List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println(list); //[abc, , bc, efg, abcd, , jkl]
        //过滤不为空的
        List<String> filtered = list.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
        System.out.println(filtered); //[abc, bc, efg, abcd, jkl]
    }

    /**
     * Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。
     *  以下代码片段使用 forEach 输出了10个随机数：
     * @auther: lyd
     * @date: 2018/9/12 14:35
     */
    public static void testForeach(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    /**
     * map 方法用于映射每个元素到对应的结果，
     *  以下代码片段使用 map 输出了元素对应的平方数：
     * @auther: lyd
     * @date: 2018/9/12 14:35
     */
    public static void testMap(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println(numbers); //[3, 2, 2, 3, 7, 3, 5]
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream()
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(squaresList); //[9, 4, 49, 25]
    }

    /**
     * filter 方法用于通过设置的条件过滤出元素。
     *  以下代码片段使用 filter 方法过滤出空字符串：
     * @auther: lyd
     * @date: 2018/9/12 14:42
     */
    public static void testFilter(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.stream()
                .filter(str -> str.isEmpty())
                .count();
        System.out.println(count);//2
    }

    /**
     * limit 方法用于获取指定数量的流。
     *  以下代码片段使用 limit 方法打印出 10 条数据
     * @auther: lyd
     * @date: 2018/9/12 14:47
     */
    public static void testLimit(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    /**
     * sorted 方法用于对流进行排序。
     *  以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序
     * @auther: lyd
     * @date: 2018/9/12 14:47
     */
    public static void testSorted(){
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    /**
     * parallelStream 是流并行处理程序的代替方法。
     *  以下实例我们使用 parallelStream 来输出空字符串的数量
     * @auther: lyd
     * @date: 2018/9/12 14:42
     */
    public static void testParallel(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.parallelStream()
                .filter(str -> str.isEmpty())
                .count();
        System.out.println(count);//2
    }

    /**
     * Collectors 类实现了很多归约操作，
     *  例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串
     * @auther: lyd
     * @date: 2018/9/12 14:42
     */
    public static void testCollectors(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);

        String mergedString  = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.joining(","));
        System.out.println("合并字符串: " + mergedString);
    }

    /**
     * 一些产生统计结果的收集器也非常有用。
     *  它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果。
     * @auther: lyd
     * @date: 2018/9/12 14:35
     */
    public static void testTongji(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println(numbers); //[3, 2, 2, 3, 7, 3, 5]
        // 获取对应的平方数
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }

}

