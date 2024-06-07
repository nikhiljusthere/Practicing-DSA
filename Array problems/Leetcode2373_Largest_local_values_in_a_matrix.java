//  2373. Largest Local Values in a Matrix
//  https://leetcode.com/problems/largest-local-values-in-a-matrix/description/


class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int n = grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        for (int i = 0; i < n - 2; i++)
        {
            for (int j = 0; j < n - 2; j++)
            {
                int maxVal = 0;
                for (int a = 0; a < 3; a++)
                {
                    for (int b = 0; b < 3; b++)
                    {
                        maxVal = Math.max(maxVal,grid[i + a][j + b]);
                    }
                }
                
                maxLocal[i][j] = maxVal;
            }
        }

        return maxLocal;
    }
}