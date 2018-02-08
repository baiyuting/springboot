package com.example.demo.test;

public class Employee {

    private Integer id;
    private String name;
    private Double sal;
    private Double bonus;

    public Employee() {
    }

    public Employee(Integer id, String name, Double sal, Double bonus) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.bonus = bonus;
    }

    public Double getTotalSal(){
        return sal+bonus;
    }
}
