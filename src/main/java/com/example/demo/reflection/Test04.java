package com.example.demo.reflection;

public class Test04 {
    static {
        System.out.println("main");
    }
    public static void main(String[] args) throws ClassNotFoundException {
//        Son son = new Son();
//        Class.forName("com.example.demo.reflection.Son");
        System.out.println(Son.b);
    }
}
class Father{
    static int b = 2;
    static {
        System.out.println("father");
    }
}
class Son extends Father{
    static {
        System.out.println("son");
        m = 300;
    }
    static  int m = 100;
}
