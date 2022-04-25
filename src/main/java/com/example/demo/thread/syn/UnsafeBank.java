package com.example.demo.thread.syn;

public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100,"结婚基金");
        Drawing you = new Drawing(account,50,"qq");
        you.start();
    }
}
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {

        if (account.money-drawingMoney<0){
            System.out.println("无钱了");
            return;
        }
        account.money = account.money-drawingMoney;
        nowMoney = nowMoney + drawingMoney;
        System.out.println(account.name+"余额"+account.money);
        System.out.println(this.getName()+"手里的钱"+nowMoney);
    }
}
