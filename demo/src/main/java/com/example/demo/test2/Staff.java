package com.example.demo.test2;

public class Staff extends Worker {

    private String dept;
    private double sal;

    public Staff(String dept, double sal) {
        this.dept = dept;
        this.sal = sal;
    }

    public Staff(String name, int age, char sex, String dept, double sal) {
        super(name, age, sex);
        this.dept = dept;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "dept='" + dept + '\'' +
                ", sal=" + sal +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
