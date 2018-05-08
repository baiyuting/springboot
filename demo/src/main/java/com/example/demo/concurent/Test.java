package com.example.demo.concurent;

public class Test {

    public static void main(String[] args) {
        TestMQService testMQService = new TestMQService();
        testMQService.put("hello", 10);
    }
}
