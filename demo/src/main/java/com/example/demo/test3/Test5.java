package com.example.demo.test3;

public class Test5 {

    public static void main(String[] args) {
        String ss = "192.168.0.1";
        System.out.println(ss.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
        System.out.println(ss.matches("(\\d{1,3}\\.){3}\\d{1,3}"));
    }
}
