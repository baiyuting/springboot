package com.example.demo.concurent;

import org.junit.Before;

import java.util.*;

public class Test2 {

    public static int leng = 2000000;
    private String[] array;
    private Set<String> set;
    private List<String> list;
    private Queue<String> queue;
    private Map<String, String> map;

    @Before
    public void init() {
        array = new String[leng];
        set = new HashSet<String>();
        list = new ArrayList<String>();
        queue = new LinkedList<String>();
        map = new HashMap<String, String>();
        for (int i = 0; i < leng; i++) {
            String key = "didi:" + i;
            String value = "da";
            array[i] = key;
            set.add(key);
            list.add(key);
            queue.add(key);
            map.put(key, value);

        }
    }

    // shzu
    @org.junit.Test
    public void testArray() {
        Long startTime = new Date().getTime();
        for (String sk : array) {
            ///
        }
        Long endTime = new Date().getTime();
        Long times = endTime - startTime;
        System.out.println("时间：" + times);
    }

    // list
    @org.junit.Test
    public void testList() {
        Long startTime = new Date().getTime();
        for (String sk : list) {
            ///
        }
        Long endTime = new Date().getTime();
        Long times = endTime - startTime;
        System.out.println("时间：" + times);
    }

    // map
    @org.junit.Test
    public void testMap() {
        Long startTime = new Date().getTime();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            entry.getKey();
        }
        Long endTime = new Date().getTime();
        Long times = endTime - startTime;
        System.out.println("时间：" + times);
        Long startTime1 = new Date().getTime();
        for (String key : map.keySet()) {
            String value = (String) map.get(key);
        }
        Long endTime1 = new Date().getTime();
        Long times1 = endTime - startTime;
        System.out.println("时间1：" + times1);
    }


    // Queue
    @org.junit.Test
    public void testQueue() {
        Long startTime = new Date().getTime();
        for (String s: queue) {
            //
        }
        Long endTime = new Date().getTime();
        Long times = endTime - startTime;
        System.out.println("时间1：" + times);
    }
    // Set
    @org.junit.Test
    public void testSet() {
        Long startTime = new Date().getTime();
        for (String s: set) {
            //
        }
        Long endTime = new Date().getTime();
        Long times = endTime - startTime;
        System.out.println("时间：" + times);
    }
}
