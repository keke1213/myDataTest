package com.practice.TestThread;

public class dog implements Runnable{
    @Override
    public void run() {
        while (true){
            eat();
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
    public void eat(){
        System.out.println("小狗在吃东西");
    }
}
