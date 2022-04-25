package com.example.demo.thread;

public class TestThread4 implements Runnable{

    private int ticketNums = 10;
    @Override
    public void run() {
        while (true) {
            if(ticketNums<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNums--);
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        new Thread(testThread4,"hh").start();
        new Thread(testThread4,"yxh").start();
        new Thread(testThread4,"lm").start();
        new Thread(testThread4,"xc").start();
        new Thread(testThread4,"sjc").start();
    }
}
