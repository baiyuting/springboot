package com.example.demo.test3;

public class TestGeneric {

    public static void main(String[] args) {
        M<String> m = new M<String>();
        m.obj="hello";
        M<?> m2 = m;
        System.out.println(m2.obj);//此时 m2 已经不能 处理 obj 属性了
    }
}

class M<T>{
    public int age = 0;

    public T obj;
}
