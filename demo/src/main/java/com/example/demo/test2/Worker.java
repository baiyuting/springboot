package com.example.demo.test2;

public class Worker {

    protected String name;
    protected int age;
    protected char sex;

    public Worker() {
    }

    public Worker(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
