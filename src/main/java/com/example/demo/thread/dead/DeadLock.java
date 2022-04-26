package com.example.demo.thread.dead;

public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"qwe");
        Makeup g2 = new Makeup(2,"ewq");
        g1.start();
        g2.start();
    }
}

class Lipstick{

}

class Mirror{

}

class Makeup extends Thread{
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();
    int choice;
    String gitlName;
    Makeup(int choice,String gitlName){
        this.choice = choice;
        this.gitlName = gitlName;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void makeup() throws InterruptedException {
        if (choice==0){
            synchronized (lipstick){
                System.out.println(this.gitlName+"口红");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(this.gitlName+"镜子");
                }
            }
        }else {
            synchronized (mirror){
                System.out.println(this.gitlName+"口红");
                Thread.sleep(2000);
                synchronized (lipstick){
                    System.out.println(this.gitlName+"镜子");
                }
            }
        }
    }
}