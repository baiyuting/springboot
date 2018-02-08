package com.example.demo.test2;

public class Manager extends Worker {

    private String title;
    private double total;

    public Manager() {
    }

    public Manager(String title, double total) {
        this.title = title;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "title='" + title + '\'' +
                ", total=" + total +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

