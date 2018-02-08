package com.example.demo.test3;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Y[] list = new Y[10];
        for (int i = 10; i >=1; i--) {
            Y y = new Y();
            y.grade = i;
            list[10-i]=y;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].grade);
        }
        System.out.println("**************************************");
        Arrays.sort(list, new G());
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].grade);
        }
    }
}

class Y {
    int grade;
}

class G implements Comparator<Y>{

    @Override
    public int compare(Y o1, Y o2) {
        return o1.grade - o2.grade;
    }
}
