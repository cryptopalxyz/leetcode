package com.course.preview;

public class MinPathSum {
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        // i是行，j是列
        int rows = grid.length, columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        //j=0
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        //i=0
        for (int j=1; j< columns; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }

        for (int i=1; i<rows; i ++)
            for (int j=1;j<columns; j++)
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];

        return dp[rows - 1][columns - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }


}



    /*
    由于每个元素对应的最小路径和与其相邻元素对应的最小路径和有关，因此可以使用动态规划求解。
    
 创建二维数组 {dp}dp，与原始网格的大小相同，{dp}[i][j]dp[i][j] 表示从左上角出发到 (i,j)(i,j) 位置的最小路径和。显然，{dp}[0][0]={grid}[0][0]dp[0][0]=grid[0][0]。对于 {dp}dp 中的其余元素，通过以下状态转移方程计算元素值。

当 i>0i>0 且 j=0j=0 时，{dp}[i][0]={dp}[i-1][0]+{grid}[i][0]dp[i][0]=dp[i−1][0]+grid[i][0]。

当 i=0i=0 且 j>0j>0 时，{dp}[0][j]={dp}[0][j-1]+{grid}[0][j]dp[0][j]=dp[0][j−1]+grid[0][j]。

当 i>0i>0 且 j>0j>0 时，{dp}[i][j]=\min({dp}[i-1][j],{dp}[i][j-1])+{grid}[i][j]dp[i][j]=min(dp[i−1][j],dp[i][j−1])+grid[i][j]。

 
    
     */