package com.qngolg.stream.demo;


import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) throws InterruptedException {
//
//        Integer count = StreamHelp.asStringList().stream().map(it -> Integer.valueOf(it))
//                .reduce((a, b) -> a + b).get();
//        IntStream intStream = IntStream.rangeClosed(0, 1000000).filter(n -> n % 2 == 0);
//        List<Thread> threadList = new ArrayList<>();
//        intStream.parallel().forEach(a -> {
//            System.out.println(a);
//            if(!threadList.contains(Thread.currentThread())){
//                threadList.add(Thread.currentThread());
//            }
//
//        });
//        Thread.sleep(5000);
//        System.out.println(threadList.size());
////        long count = (long) intStream.count();
////        System.out.println(count);
//        System.out.println(Thread.activeCount());
//        Stream.of(1).collect(Collectors.toList());
    }

}
