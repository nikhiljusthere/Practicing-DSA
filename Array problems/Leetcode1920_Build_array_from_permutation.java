//  1920. Build Array from Permutation
//  https://leetcode.com/problems/build-array-from-permutation/description/


class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int a : nums)
        {
            ans[a] = nums[nums[a]];
        }
        return ans;
    }
}