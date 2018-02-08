package com.example.demo.test3;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count < 3) {
            int num = input.nextInt();
            sum += num;
            count++;
        }
        System.out.println("总数是" + sum);
        input.close();
    }
}
