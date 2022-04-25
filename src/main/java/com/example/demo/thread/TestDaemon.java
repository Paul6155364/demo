package com.example.demo.thread;

public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        You1 you1 = new You1();
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();
        new Thread(you1).start();
    }

}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("god");
        }
    }
}

class You1 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<365;i++){

            System.out.println("live");
        }
        System.out.println("goodbye world");
    }
}
