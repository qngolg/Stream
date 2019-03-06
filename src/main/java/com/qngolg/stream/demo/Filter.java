package com.qngolg.stream.demo;

import com.qngolg.stream.StreamHelp;

public class Filter {

    public static void main(String[] args) {
        StreamHelp.asStringList().stream().filter(it -> it.equals("1"))
                .forEach(System.out::println);
    }
}
