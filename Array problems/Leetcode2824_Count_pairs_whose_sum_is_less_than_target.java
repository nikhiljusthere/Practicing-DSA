//  2824. Count Pairs Whose Sum is Less than Target
//  https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/


class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();    //list-size , array-length

        int[] arr = new int[nums.size()];   //new array of size eqaual to nums list

        for (int i = 0; i < n; i++)
        {
            arr[i] = nums.get(i);   //assigning list values in array
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i < j && j < n && arr[i] + arr[j] < target)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}