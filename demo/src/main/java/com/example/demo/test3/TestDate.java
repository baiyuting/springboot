package com.example.demo.test3;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        System.out.println(new Date().getMonth());
    }

    @Test
    public void test() {
        System.out.println(Calendar.getInstance().get(Calendar.MONTH));
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        System.out.println(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void test2() throws ParseException {
        Long time = Calendar.getInstance().getTime().getTime() - new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-05-14 14:00:00").getTime();
        System.out.println(time / 1000 / 60);
    }
}
