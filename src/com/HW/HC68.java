package com.HW;

public class HC68 {
    public static void main(String[] args) {
        System.out.println(jumpFloor(7));
    }

    public static int jumpFloor(int target) {
        int p=1,q=1,r=2;
        for(int i=2;i<target;i++){
            p=q+r;
            q=r;
            r=p;
        }
        return r;

    }
}
