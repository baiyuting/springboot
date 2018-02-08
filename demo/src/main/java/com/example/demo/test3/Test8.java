package com.example.demo.test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("#");
        String path = "d:\\";
        String content = input.next();
        String title = input.next();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(path + title));
            writer.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        input.close();
        writer.close();
    }
}
