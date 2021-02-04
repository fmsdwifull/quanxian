package com.study.houtai.utils;

import lombok.Data;

import java.util.List;

@Data
public class RespJson<T> {
    private int  code;
    private String  msg;
    private Integer count;
    private List<T> data;
}
