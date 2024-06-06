//  1470. Shuffle the Array
//  https://leetcode.com/problems/shuffle-the-array/description/


class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] array = new int[nums.length];
        for (int i = 0; i < n; i++)
        {
            array[2*i] = nums[i];
            array[2*i + 1] = nums[i + n];
        }
        return array;
    }
}