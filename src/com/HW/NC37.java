package com.HW;

import java.util.*;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class NC37 {//没通过
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> arrayList=new ArrayList<>();
        Collections.sort(arrayList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start!=o2.start){
                    return o1.start-o2.start;
                }else {
                    return o1.end-o2.end;
                }
            }
        });

        if (intervals.size()<2){
            return intervals;
        }
        Interval r1 = intervals.get(0);
        for (int i=0;i<intervals.size()-1;i++){
            Interval r2 = intervals.get(i+1);
            if (r1.end>=r2.start){
                if (r1.end>=r2.end){
                    r1=new Interval(r1.start,r1.end);
                }else {
                    r1=new Interval(r1.start,r2.end);
                }

            }else {
                arrayList.add(r1);
                r1=r2;
            }

        }
            return arrayList;
    }
}
