package com.qngolg.stream.whyUseStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Demo {

    public static class User {
        Double userNo;
        String name;

        public User(Double u, String s) {
            this.userNo = u;
            this.name = s;
        }
    }

    public static List<User> collect = Stream.generate(() -> Math.random() * 100000000)
            .distinct().limit(10000000)
            .map(u -> new User(u, "name_" + u))
            .collect(toList());

    public static void main(String[] args) {
        filterBeforeJava8();
        filterAfterStream();
        parallelTo();

    }

    /**
     * 在Java8 之前处理百万条数据
     */
    public static void filterBeforeJava8() {
        long start = System.currentTimeMillis();
        List<User> userList = new ArrayList<>();
        for (User user : collect) {
            if (user.userNo < 1000) {
                userList.add(user);
            }
        }
        System.out.println(userList.size());
        long end = System.currentTimeMillis();
        System.out.println( "java8之前用foreach处理百万数据耗时：" + (end - start));
    }

    /**
     * 使用Stream处理百万条数据
     */
    public static void filterAfterStream() {
        long start = System.currentTimeMillis();
        List<User> userList = collect.stream()
                .filter(u -> u.userNo < 1000)
                .collect(toList());
        System.out.println(userList.size());
        long end = System.currentTimeMillis();
        System.out.println( "Stream的方式处理百万数据耗时：" + (end - start));
    }

    /**
     * 使用并行的方式处理百万条数据
     */
    public static void parallelTo() {
        long start = System.currentTimeMillis();
        List<User> userList = Demo.collect.parallelStream()
                .filter(u -> u.userNo < 1000)
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.println(userList.size());
        System.out.println( "使用并行流的方式处理百万条数据：" + (end - start));
    }
}
