package com.example.demo.test3;

import java.util.Random;

public class Test3 {

    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        while(count < 5) {
            int num = random.nextInt(31);
            if (num != 0){
                count ++;
                System.out.println(num);
            }
        }
    }
}
