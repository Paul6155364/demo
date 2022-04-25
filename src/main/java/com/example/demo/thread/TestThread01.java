package com.example.demo.thread;

public class TestThread01 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {
        TestThread01 testThread01 = new TestThread01();
        testThread01.start();
        for (int i=0;i<20;i++){
            System.out.println("我在学习多线程"+i);
        }
    }
}
