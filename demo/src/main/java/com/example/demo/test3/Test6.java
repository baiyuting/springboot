package com.example.demo.test3;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test6 {

    public static void main(String[] args) {
        String s = "1981-09-19 09:07:27.727";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(dateFormat.format(new Date()));;
        try {
            Date date = dateFormat.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        String day = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());//今天时间
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        //昨天的时间
        String beginTime = day + " " + (hour - 2) + ":00:00";
        String endTime = day + " " + (hour - 2) + ":59:59";
        System.out.println(hour);
        System.out.println(beginTime);
        System.out.println(endTime);
    }
}
