package com.practice.TestThread;

public class cat extends Thread{
    @Override
    public void run() {
        while (true){
            eat();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public void eat(){
        System.out.println("猫咪在吃东西");
    }
}
