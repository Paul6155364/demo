package com.example.demo.thread;

public class TestSleep implements Runnable{

    private int ticketNums = 10;
    @Override
    public void run() {
        while (true) {
            if(ticketNums<=0){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNums--);
        }
    }

    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();
        new Thread(testSleep,"hh").start();
        new Thread(testSleep,"yxh").start();
        new Thread(testSleep,"lm").start();
        new Thread(testSleep,"xc").start();
        new Thread(testSleep,"sjc").start();
    }
}
