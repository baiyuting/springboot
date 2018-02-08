package com.example.demo.domain;

public class Message<T> {

    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
