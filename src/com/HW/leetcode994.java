package com.HW;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode994 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(ints));
    }

    public static int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        int round = 0;
        while (count > 0 && !queue.isEmpty()) {
            round++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();//坐标
                int row = poll[0];//
                int col = poll[1];
                if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                    count--;
                    queue.offer(new int[]{row - 1, col});
                    grid[row-1][col]=2;
                }
                if (row + 1 < grid.length && grid[row + 1][col] == 1) {
                    count--;
                    queue.offer(new int[]{row + 1, col});
                    grid[row+1][col]=2;
                }
                if (col + 1 < grid[row].length && grid[row ][col+1] == 1) {
                    count--;
                    queue.offer(new int[]{row, col + 1});
                    grid[row][col+1]=2;
                }
                if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                    count--;
                    queue.offer(new int[]{row, col - 1});
                    grid[row][col-1]=2;
                }
            }
        }
        if (count > 0) return -1;
        return round;
    }
}