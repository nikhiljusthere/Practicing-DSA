//  2413. Smallest Even Multiple
//  https://leetcode.com/problems/smallest-even-multiple/description/


class Solution {
    public int smallestEvenMultiple(int n) {

        int value = 0;
        if (n == 2 || n == 1)
        {
            return 2;
        }

        if (n == 0)
        {
            return 0;
        }

        if (n % 2 == 0)     //for even n
        {
            for (int i = n ; i >= n; i++)   //multiple should be > or = n
            {
                if (n % i == 0  &&  i % 2 == 0)
                {
                    return i;
                }
            }
        }

        if (n % 2 != 0)     //for odd n
        {
            value = n*2;
        }

        return value;

        
    }
}