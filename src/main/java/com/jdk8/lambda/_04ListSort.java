package com.jdk8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/9/12
 * @Version:v1.0
 */
public class _04ListSort {

    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
        System.out.println(Arrays.asList(players));
        test1(players);
        System.out.println("--------------------------");
        test2(players);
        System.out.println("--------------------------");
        test3(players);
        System.out.println("------------注意：char排序--------------");
        test4(players);
    }



    public static void test1(String[] players){
        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.compareTo(o2));
            }
        });
        System.out.println(Arrays.asList(players));
        // 1.2 使用 lambda expression 排序 players
        Comparator<String> sortByName = (String s1, String s2) -> s2.compareTo(s1);
        Arrays.sort(players, sortByName);
        System.out.println(Arrays.asList(players));
        // 1.3 也可以采用如下形式:
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));
        System.out.println(Arrays.asList(players));
    }

    public static void test2(String[] players){
        // 2.1 使用匿名内部类根据 surname 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //System.out.println(o1.substring(o1.indexOf(" ")));
                return (o1.substring(o1.indexOf(" ")).compareTo(o2.substring(o2.indexOf(" "))));
            }
        });
        System.out.println(Arrays.asList(players));
        // 2.2 使用 lambda expression 排序,根据 surname
        Comparator<String> sortBySurname = (String s1, String s2) ->
                ( s1.substring(s1.indexOf(" ")).compareTo( s2.substring(s2.indexOf(" ")) ) );
        Arrays.sort(players, sortBySurname);
        System.out.println(Arrays.asList(players));
        // 2.3 或者这样,怀疑原作者是不是想错了,括号好多...
        Arrays.sort(players, (String s1, String s2) ->
                ( s1.substring(s1.indexOf(" ")).compareTo( s2.substring(s2.indexOf(" ")) ) )
        );
        System.out.println(Arrays.asList(players));
    }

    public static void test3(String[] players){
        // 3.1 使用匿名内部类根据 name lenght 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.length() - s2.length());
            }
        });
        System.out.println(Arrays.asList(players));
        // 3.2 使用 lambda expression 排序,根据 name lenght
        Comparator<String> sortByNameLenght = (String s1, String s2) -> (s1.length() - s2.length());
        Arrays.sort(players, sortByNameLenght);
        System.out.println(Arrays.asList(players));
        // 3.3 or this
        Arrays.sort(players, (String s1, String s2) -> (s1.length() - s2.length()));
        System.out.println(Arrays.asList(players));
    }

    public static void test4(String[] players){
        // 4.1 使用匿名内部类排序 players, 根据最后一个字母
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
            }
        });
        System.out.println(Arrays.asList(players));
        // 4.2 使用 lambda expression 排序,根据最后一个字母
        Comparator<String> sortByLastLetter =
                (String s1, String s2) ->
                        (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        Arrays.sort(players, sortByLastLetter);

        // 4.3 or this
        Arrays.sort(players, (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));
    }
}

