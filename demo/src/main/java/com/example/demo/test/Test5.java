package com.example.demo.test;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {

    public static void main(String[] args) {
        String ss = "MLDN中心Java技术学习班20130214";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(ss);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
