package com.example.demo.thread;

public class TestRunnable01 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {
        TestRunnable01 testRunnable01 = new TestRunnable01();
        Thread thread = new Thread(testRunnable01);
        thread.start();
        for (int i=0;i<20;i++){
            System.out.println("我在学习多线程"+i);
        }
    }
}
