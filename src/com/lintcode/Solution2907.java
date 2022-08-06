package com.lintcode;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Solution2907{
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        Thread[] thread = Solution2907.getWeekDay();
        for (Thread t : thread) {
            t.start();
        }
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        TreeMap<String, String> rmap = new TreeMap<>(Solution2907.map);
        System.out.println("Time limit 200ms: " + ((end - start) < 240));
        System.out.println("Solution.map.size() = " + Solution2907.map.size());
        System.out.println("Solution.map = " + rmap);
    }

    //jdk1.8以上
    static String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    //要用线程安全的map，否则实际插入会小于7000
    static Map<String ,String> map = new ConcurrentHashMap<>();

    static Thread[] getWeekDay() throws Exception {
        Thread[] weekDay = new Thread[10];
        // write your code here
        LocalDate time = LocalDate.of(2021,10,1);
        //开了10个线程,每个线程分700天
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Thread thread=  new Thread(new Runnable() {
                @Override
                public void run() {
                    LocalDate startTime = time.plusDays(finalI *700L);
                    for (int j = 0; j < 700; j++) {
                        int week = startTime.getDayOfWeek().getValue() == 7 ?  0 : startTime.getDayOfWeek().getValue();
                        map.put(startTime.toString(),day[week]);
                        //日期往后推1
                        startTime = startTime.plusDays(1);
                    }
                }
            });
            thread.start();
            weekDay[i] = thread;
        }
        return weekDay;
    }
}
