//  2011. Final Value of Variable After Performing Operations
//  https://leetcode.com/a/final-value-of-variable-after-performing-operations/description/


class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int count = 0;
        for (int i = 0; i < operations.length; i++)
        {
            if (operations[i].equals("X++"))
            count++;
            if (operations[i].equals("--X"))
            --count;
            if (operations[i].equals("X--"))
            count--;
            if (operations[i].equals("++X"))
            ++count;
        }
        return count;
    }
}