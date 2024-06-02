//  2652. Sum Multiples
//  https://leetcode.com/problems/sum-multiples/description/


class Solution {
    public int sumOfMultiples(int n) {
        
        int count = 0;
        for (int i = 0; i <= n; i++)
        {
            if ( i % 3 == 0  ||  i % 5 == 0  ||  i % 7 == 0 )
            {
                count = count + i;
            }
        }

        return count;
    }
}