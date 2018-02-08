package com.example.demo.test2;

public class Student extends Person {

    private double math;
    private double english;

    public Student() {
    }

    public Student(double math, double english) {
        this.math = math;
        this.english = english;
    }

    public Student(String name, String address, char sex, Integer age, double math, double english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "math=" + math +
                ", english=" + english +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
