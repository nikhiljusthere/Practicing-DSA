//Concatenation of Array
//https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2]; //creating array of size twice that of nums

        for (int i = 0; i < n; i++ )
        {
            ans[i] = nums[i];   //assigns (i)th element of nums to (i)th element of ans 
            ans[i+n] = nums[i]; //assigns (i)th element of nums to (i+n)th element of ans
        }
        return ans;
    }
}