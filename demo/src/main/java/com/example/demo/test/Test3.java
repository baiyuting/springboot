package com.example.demo.test;

public class Test3 {

    public static void main(String[] args) {
        String ss = "want you to know one thing";
        int n1 = 0;
        int n2 = 0;
        for (int i=0;i<ss.length();i++) {
            char c = ss.charAt(i);
            if (c=='n'){
                n1++;
            }
            if (c=='o'){
                n2 ++;
            }
        }

        System.out.println("n出现次数：" + n1);
        System.out.println("o出现次数：" + n2);
    }
}
