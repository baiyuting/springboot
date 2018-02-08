package com.example.demo.test;

public class Dog {

    private Integer age;
    private String color;
    private String name;

    public Dog() {
    }

    public Dog(Integer age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
