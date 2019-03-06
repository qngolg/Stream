package com.qngolg.stream.demo;

import com.qngolg.stream.StreamHelp;

import java.util.List;

public class Test1 {

    public static <T,R> R apply(FunctionInterfaceDemo<T,R> functionInterfaceDemo , T t){
        return functionInterfaceDemo.apply(t);
    }

    public static void main(String[] args) {
        Integer apply = apply((t) -> t + 1, 1);
        System.out.println(apply);
        List<String> strings = StreamHelp.asStringList();
        strings.stream()
                .filter(a -> a.equals("xxx"))
                .mapToInt(Integer::valueOf)
                .sum();

    }

    static interface Fun1<T,R>{
        R fun1(T t);
    }

    @FunctionalInterface
    static interface Fun2<T,Fun1>{
       Fun1 fun2(T t);
    }
}
