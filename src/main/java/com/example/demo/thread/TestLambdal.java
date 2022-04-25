package com.example.demo.thread;

public class TestLambdal {
    static class Like2 implements ILkie{
        @Override
        public void lambda() {
            System.out.println("like lambda2");
        }
    }
    public static void main(String[] args) {
        ILkie like = new Like();
        like.lambda();
        like = new Like2();
        like.lambda();
        class Like3 implements ILkie{
            @Override
            public void lambda() {
                System.out.println("like lambda3");
            }
        }
        like = new Like3();
        like.lambda();
        like = new ILkie() {
            @Override
            public void lambda() {
                System.out.println("like lambda4");
            }
        };
        like.lambda();
        like = ()->{
            System.out.println("like lambda5");
        };
        like.lambda();

    }
}
interface ILkie{
    void lambda();
}

class Like implements ILkie{
    @Override
    public void lambda() {
        System.out.println("like lamdba");
    }
}
