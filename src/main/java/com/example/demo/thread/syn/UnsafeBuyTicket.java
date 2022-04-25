package com.example.demo.thread.syn;

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"qq").start();
        new Thread(buyTicket,"ww").start();
        new Thread(buyTicket,"ee").start();
    }
}

class BuyTicket implements Runnable{

    private int ticketNums = 10;
    boolean flag = true; //外部停止方式
    @Override
    public void run() {
        //买票
        while (flag){
            buy();
        }
    }

    private void buy(){
        if(ticketNums<=0){
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}