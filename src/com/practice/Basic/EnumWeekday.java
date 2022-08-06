package com.practice.Basic;

public class EnumWeekday {
    enum Day{
        Monday,Tuesday,Wentnsday,Friday
    }

    public static void main(String[] args) {
        Day da = Day.Monday;
        Day da1 = Day.Friday;
        System.out.println(da.compareTo(da1)+"--"+da1);
    }
}
