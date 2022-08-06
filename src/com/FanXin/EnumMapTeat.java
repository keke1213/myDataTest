package com.FanXin;

import java.util.*;

public class EnumMapTeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = sc.nextLine().trim().split(" ");

        List<WeekDay> list = new ArrayList<>();
        for (String s : days) {
            WeekDay w = WeekDay.valueOf(s);
            list.add(w);
        }
        EnumMap<WeekDay, Integer> result = getRestDays(list);

        System.out.println(result);

        sc.close();
    }

    public static EnumMap<WeekDay, Integer> getRestDays(List<WeekDay> list) {
        // write your code here

        Map<WeekDay, Integer> e =new HashMap<>();
        e.put(WeekDay.SAT,0);
        e.put(WeekDay.SUN,0);
        Iterator<WeekDay> iterator = list.iterator();
        while (iterator.hasNext()){
            WeekDay next = iterator.next();
            if (e.containsKey(next)){
                Integer integer = e.get(next);
                e.put(next,++integer);
            }
        }
        e.remove(WeekDay.SUN,0);
        e.remove(WeekDay.SAT,0);
        return new EnumMap<WeekDay, Integer>(e);
    }

}