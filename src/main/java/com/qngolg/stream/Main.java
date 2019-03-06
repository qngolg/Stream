package com.qngolg.stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3");
        list.stream().forEach(System.out::println);
    }
}
