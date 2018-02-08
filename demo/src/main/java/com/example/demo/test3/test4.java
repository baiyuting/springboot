package com.example.demo.test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ss = input.nextLine();
        System.out.println(ss.matches("\\w+@\\w+\\.com\\w*"));
        input.close();
    }
}
