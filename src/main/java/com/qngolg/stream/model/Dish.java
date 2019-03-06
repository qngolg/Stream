package com.qngolg.stream.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Dish {
    private String name;
    private Integer calorie;
    private String type;
}
