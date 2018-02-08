package com.example.demo.test2;

public class Person {

    protected String name;
    protected String address;
    protected char sex;
    protected Integer age;

    public Person() {
    }

    public Person(String name, String address, char sex, Integer age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
