package com.example.demo.test3;

import java.lang.reflect.Method;

public class TestMethod {

    public static void main(String[] args) {
        Method[] methods = B.class.getDeclaredMethods();
        for (Method m :
                methods) {
            System.out.println(m.getName());
        }
    }
}

class A {
    public void a(){

    }

    private void a2(){

    }
}

class B extends A {
    public void b(){

    }

    private void b2(){

    }
}
