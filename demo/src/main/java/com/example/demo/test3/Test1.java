package com.example.demo.test3;

import org.junit.jupiter.api.Test;

public class Test1 {

    private int num = 10;

    @Test
    public void test() {

        Add add = new Add();
        Thread t1 = new Thread(add);
        Thread t2 = new Thread(add);

        Sub sub = new Sub();
        Thread t3 = new Thread(sub);
        Thread t4 = new Thread(sub);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }

    class Add implements Runnable{

        @Override
        public void run() {
            num ++;
            System.out.println(num);
        }
    }

    class Sub implements Runnable{

        @Override
        public void run() {
            num --;
            System.out.println(num);
        }
    }
}
