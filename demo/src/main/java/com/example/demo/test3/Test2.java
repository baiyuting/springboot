package com.example.demo.test3;

public class Test2 {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char i='a';i<='z';i++){
            stringBuffer.append(i);
        }
        System.out.println(stringBuffer.toString());
    }
}
