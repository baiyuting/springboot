package com.example.demo.test;

import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Test21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNext()) {
            int a = input.nextInt();
            System.out.println(a % 3 == 0 && a % 5 == 0 && a % 7 == 0);
        }
    }

    @Test
    public void test() {
        File file = new File("D:\\work");
        printFile(file, 0);
    }

    void printFile(File file, int deep) {
        if (file.isDirectory() && deep <= 2) {
            if (file.getName().matches("\\d{4}.*"))
                System.out.println(file.getName());
            deep++;
            if (file.getName().equals("work") || file.getName().equals("2017"))
                for (int i = 0; i < file.listFiles().length; i++)
                    printFile(file.listFiles()[i], deep);
        }
    }

}
