package com.example.demo.test2;

public class Triangle implements Shape{

    private double length;
    private double height;

    private double length2;
    private double length3;


    public Triangle(double length, double height, double length2, double length3) {
        this.length = length;
        this.height = height;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        return (length * height) / 2;
    }

    @Override
    public double perimeter() {
        return length + length2 + length3;
    }
}
