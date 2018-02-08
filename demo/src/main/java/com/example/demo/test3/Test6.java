package com.example.demo.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {

    public static void main(String[] args) {
        String s = "1981-09-19 09:07:27.727";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            Date date = dateFormat.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
