package com.example.demo;

import com.example.demo.domain.Message;

public class TestDemo {

    public static void main(String[] args) {

        Message<Integer> message = new Message<>();
        fun(message);
        System.out.println(message.getInfo());

    }

    public static void fun(Message message) {
        message.setInfo("哈哈哈哈，世界和平");
    }
}
