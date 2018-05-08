package com.example.demo.regex;

import org.apache.commons.lang3.StringUtils;

public class Test2 {

    public static void main(String[] args) {
        String ss = "";
        if (StringUtils.isBlank(ss) || !ss.matches("\\d+")) {
            System.out.println("hello");
        } else
            System.out.println("back");
    }
}
