package com.example.demo.reflection;

public class Test10 {

    public void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            user.getName();
        }
        long endTime = System.currentTimeMillis();
    }
}
