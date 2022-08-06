package com.practice.TestThread;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class Test01 {
//    public static AtomicInteger  atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
//        atomicInteger.incrementAndGet();
        Thread thread=new cat();
//        thread.wait();
//        thread.notify();
        thread.start();
        Runnable runnable=new dog();
//        runnable.run();
        Thread thread1=new Thread(runnable,"狗线程");
        thread1.start();
//        线程池
//        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor();




    }
}
