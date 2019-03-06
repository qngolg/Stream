package com.qngolg.stream.whyUseStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 并行流测试
 */
public class ParallelStreamTest {

    /**
     * 测试计算并行流的线程池大小
     */
    public static void main(String[] args) {
        //设置forkJoinPool的线程数量大小
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "3");
        IntStream intStream = IntStream.rangeClosed(0, 1000000).filter(n -> n % 2 == 0);
        List<Thread> threadList = new ArrayList<>();
        intStream.parallel().forEach(a -> {
            System.out.println(a);
            if(!threadList.contains(Thread.currentThread())){
                threadList.add(Thread.currentThread());
            }

        });
        System.out.println("创建的线程数量："+threadList.size());
        System.out.println("系统核数： " + Runtime.getRuntime().availableProcessors());
    }
}
