package com.example.demo.test3;

import java.util.ArrayList;
import java.util.List;

public class Test10 {

    class Employee{
        private int empno;
        private Dept dept;
        private String name;
        private String job;
        private String mgr;
        private double sal;
        private double comm;

        public Employee(int empno, Dept dept, String name, String job, String mgr, double sal, double comm) {
            this.empno = empno;
            this.dept = dept;
            this.name = name;
            this.job = job;
            this.mgr = mgr;
            this.sal = sal;
            this.comm = comm;
        }

        public int getEmpno() {
            return empno;
        }

        public void setEmpno(int empno) {
            this.empno = empno;
        }

        public Dept getDept() {
            return dept;
        }

        public void setDept(Dept dept) {
            this.dept = dept;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getMgr() {
            return mgr;
        }

        public void setMgr(String mgr) {
            this.mgr = mgr;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }

        public double getComm() {
            return comm;
        }

        public void setComm(double comm) {
            this.comm = comm;
        }
    }

    class Dept{
        private int  deptno;
        private String deptName;
        private String location;
        List<Employee> employees = new ArrayList<>();

        public int getDeptno() {
            return deptno;
        }

        public void setDeptno(int deptno) {
            this.deptno = deptno;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public List<Employee> getEmployees() {
            return employees;
        }

        public void setEmployees(List<Employee> employees) {
            this.employees = employees;
        }
    }
}
