//  1672. Richest Customer Wealth
//  https://leetcode.com/problems/richest-customer-wealth/description/


class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int m = accounts.length; 
        int n = accounts[0].length;
        int wealth = 0;
        int maxwealth = 0;
        for (int i = 0; i < m; i++)     //traversing rows
        {
            wealth = 0;     //reseting wealth after every row

            for (int j = 0; j < n; j++)     //traversing columns
            {
                wealth += accounts[i][j];
            }

            if (wealth > maxwealth)
            {
                maxwealth = wealth;
            }
        }

        return maxwealth;
    }
}