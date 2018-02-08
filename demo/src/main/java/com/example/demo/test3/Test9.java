package com.example.demo.test3;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String content = input.nextLine();
        int odd = 0;
        int even = 0;
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (Character.isDigit(c)) {
                if ((int) c % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("偶数：" + even);
        System.out.println("奇数：" + odd);
        input.close();
    }
}
