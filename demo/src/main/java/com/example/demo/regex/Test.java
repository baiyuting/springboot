package com.example.demo.regex;

public class Test {

    public static void main(String[] args) {
        String[] ss = new String[]{"com","cn","c","ccn"};
        for (String temp :
                ss) {
            System.out.println(temp.matches("\\.(com|cn)"));
        }
    }
}
