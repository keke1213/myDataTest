package com.leetcode;

public class DiffrentePath63 {
    public static void main(String[] args) {
            int[][] ints=new int[][]{{0,0,0},{0,1,0},{0,0,0}};
            int[][] intss=new int[][]{{1}};
        System.out.println(uniquePathsWithObstacles(intss));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                }
                     else if(j==0&&i==0) {
                    obstacleGrid[i][j] = 1;
                }
                else if(j==0){
                    obstacleGrid[i][j]=obstacleGrid[i-1][j];
                }
                else if(i==0){
                    obstacleGrid[i][j]=obstacleGrid[i][j-1];
                }else {
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[obstacleGrid.length-1].length-1];
    }
    public static void  dfs(int[][] obstacleGrid, int i, int j,Integer sum){

    }
}
