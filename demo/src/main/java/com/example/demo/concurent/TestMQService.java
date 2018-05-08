package com.example.demo.concurent;


import javax.annotation.Resource;
import java.util.*;

public class TestMQService {

    private static int currentIndex = 0;
    private static Set<Task>[] slots = new Set[3600];
    private static Timer timer = new Timer();

    static {
        for (int i = 0; i < slots.length; i++)
            slots[i] = new HashSet<Task>();
        //启动定时任务，每秒移动 currentIndex
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                currentIndex = (currentIndex + 1) % slots.length;
                System.out.println("currentIndex" + currentIndex);
                Set<Task> slot = slots[currentIndex];
                Iterator<Task> tasks = slot.iterator();
                while (tasks.hasNext()) {
                    Task task = tasks.next();
                    System.out.println("task" + task.cycleNum);
                    if (task.cycleNum == 0) {
                        //1、启动本task线程
                        new Thread(task).start();
                        tasks.remove();//删除本task
                    } else {
                        task.cycleNum--;//cycleNum--
                    }
                }
            }
        }, 0, 1000);
    }

    public TestMQService() {

    }

    class Task implements Runnable {
        int cycleNum;//current

        String msg;//需要发送的消息

        /**
         * @param msg
         * @param delay 按秒算
         */
        public Task(String msg, int delay) {
            this.msg = msg;
            cycleNum = delay / 3600;
        }

        @Override
        public void run() {
            System.out.println("定时任务执行" + msg);
        }

    }

    /**
     * @param msg
     * @param delay 延迟几秒
     */
    public void put(String msg, int delay) {
        Task task = new Task(msg, delay);
        slots[(currentIndex + delay) % slots.length].add(task);
    }

}
