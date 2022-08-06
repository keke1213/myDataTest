package com.practice.Basic;



public class RunnableDemo implements Runnable {
    private Thread t;
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
        System.out.println("构造方法"+name);
    }

    @Override
    public void run() {
        System.out.println("Running " +  name );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + name + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(1000);

            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  name + " interrupted.");
        }
        System.out.println("Thread " +  name + " exiting.");
    }
    public void start () {
        System.out.println("Starting " +  name );
        if (t == null) {
            t = new Thread (this, name);
            t.start ();
        }
    }

    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo( "线程1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo( "线程2");
        R2.start();
        RunnableDemo R3 = new RunnableDemo( "线程3");
        R3.start();
        RunnableDemo R4 = new RunnableDemo( "线程4");
        R4.start();
        RunnableDemo R5 = new RunnableDemo( "线程5");
        R5.start();
        RunnableDemo R6 = new RunnableDemo( "线程6");
        R6.start();
    }
}
