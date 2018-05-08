package com.example.demo.test3;

import org.junit.Test;

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
}
