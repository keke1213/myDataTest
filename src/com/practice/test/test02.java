package com.practice.test;

public class test02 {
    public synchronized void fun1(){
        System.out.println("fun1");
    }
    public static synchronized void fun2(){
        System.out.println("fun2");
    }
    public  void fun3(){
        synchronized (this){
            System.out.println("fun3");
        }
    }
}
