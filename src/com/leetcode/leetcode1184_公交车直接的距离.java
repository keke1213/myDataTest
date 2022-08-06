package com.leetcode;

public class leetcode1184_公交车直接的距离 {
    public static void main(String[] args) {
//        distanceBetweenBusStops(new int[]{1,2,3,4},0,1);
        distanceBetweenBusStops(new int[]{7,10,1,12,11,14,5,0},7,2);
    }
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        int length = distance.length;
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
        }
        int path=0;
        int index=start%length;
        while (index!=destination){
            path+=distance[index];
            index++;
            index=index%length;
        }

        return sum-path>path?path:sum-path;
    }
}
