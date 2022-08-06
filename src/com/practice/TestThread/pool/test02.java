package com.practice.TestThread.pool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class test02 {
    public static void main(String[] args) {
        ThreadFactory factory=r -> new Thread(r, "test-thread-pool");
    }
}
