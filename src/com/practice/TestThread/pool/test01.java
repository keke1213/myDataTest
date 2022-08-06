package com.practice.TestThread.pool;

import sun.security.provider.NativePRNG;

import java.util.concurrent.*;

public class test01 {
    /**
     * // Java线程池的完整构造函数
     * public ThreadPoolExecutor(
     *   int corePoolSize, // 线程池长期维持的线程数，即使线程处于Idle状态，也不会回收。
     *   int maximumPoolSize, // 线程数的上限
     *   long keepAliveTime, TimeUnit unit, // 超过corePoolSize的线程的idle时长，
     *                                      // 超过这个时间，多余的线程会被回收。
     *   BlockingQueue<Runnable> workQueue, // 任务的排队队列
     *   ThreadFactory threadFactory, // 新线程的产生方式
     *   RejectedExecutionHandler handler) // 拒绝策略 接口
     *
     *  拒绝策略 ThreadPoolExecutor.**
     * 拒绝行为
     * AbortPolicy
     * 抛出RejectedExecutionException
     * DiscardPolicy
     * 什么也不做，直接忽略
     * DiscardOldestPolicy
     * 丢弃执行队列中最老的任务，尝试为当前提交的任务腾出位置
     * CallerRunsPolicy
     * 直接由提交任务者执行这个任务
     */

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();//不建议
//
        ExecutorService executorService1 =
                new ThreadPoolExecutor(1,1,
                2000, TimeUnit.SECONDS
//
        , new ArrayBlockingQueue<>(512) //有界队列避免oom

                        ,new ThreadPoolExecutor.DiscardOldestPolicy()//拒接策略
                );// 第二种建议

//     new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
//             new SynchronousQueue<>(), new ThreadFactory() {
//         @Override
//         public Thread newThread(Runnable r) {
//             return null;
//         }
//     },new ThreadPoolExecutor.DiscardOldestPolicy());


//        executorService1.execute(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    System.out.println("线程1--");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        executorService1.execute(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    System.out.println("线程2--");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });

//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        Future<Object> future = executorService.submit(new Callable<Object>() {
//            @Override
//            public Object call() throws Exception {
//                throw new RuntimeException("exception in call~");// 该异常会在调用Future.get()时传递给调用者
//            }
//        });
//
//        try {
//            Object result = future.get();//java.lang.RuntimeException: exception in call~
//        } catch (InterruptedException e) {
//            // interrupt
//        } catch (ExecutionException e) {
//            // exception in Callable.call()
//            e.printStackTrace();
//        }



    }
}
