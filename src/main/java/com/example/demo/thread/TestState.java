package com.example.demo.thread;

public class TestState {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i=0;i<5;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
    }
}
