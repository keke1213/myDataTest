package com.HW;

import java.util.*;

//[[10,30],[20,60],[80,100],[150,180]]
public class NC37II {
    public static void main(String[] args) {
        Interval interval1=new Interval(1,4);
        Interval interval2=new Interval(2,3);
//        Interval interval1=new Interval(1,4);
//        Interval interval2=new Interval(0,2);
//        Interval interval1=new Interval(10,30);
//        Interval interval2=new Interval(20,60);
//        Interval interval3=new Interval(80,100);
//        Interval interval4=new Interval(150,180);
//        Interval interval5=new Interval(0,60);
//        Interval interval6=new Interval(0,70);
        ArrayList<Interval> arrayList=new ArrayList<>();
        arrayList.add(interval1);
        arrayList.add(interval2);
//        arrayList.add(interval3);
//        arrayList.add(interval4);
//        arrayList.add(interval5);
//        arrayList.add(interval6);
        merge(arrayList);

    }
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals.size()<2)return intervals;
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start==o2.start){
                    return o1.end-o2.end;
                }
                return o1.start-o2.start;
            }
        });
        Stack<Interval> stack=new Stack<>();
        ArrayList<Interval> newintervals=new ArrayList<>();
        Interval left=intervals.get(0);
        stack.add(left);
        Interval right=null;
        for (int i=1;i<intervals.size();i++){
            if (!stack.isEmpty()){
                left=stack.pop();
                right=intervals.get(i);
                if (left.end>=right.start&&left.end<=right.end){
                    stack.add(new Interval(left.start,right.end));
                }else if(left.end>right.end){
                    stack.add(new Interval(left.start,left.end));
                }
                else {
                    newintervals.add(left);
                    stack.add(right);
                }
            }else {
                stack.add(intervals.get(i));
            }
        }
        if (!stack.isEmpty())newintervals.add(stack.pop());

        return newintervals;
    }
    public  static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

}

