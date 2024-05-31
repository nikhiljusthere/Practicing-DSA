//  1431. Kids With the Greatest Number of Candies
//  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int maxcandies = 0;

        for (int i = 0; i < candies.length;i++)
        {
            if(candies[i] > maxcandies)
            {
                maxcandies = candies[i];
            }
        }

        for (int i = 0; i < candies.length;i++)
        {
            result.add(candies[i] + extraCandies >= maxcandies);
        }

        return result;

    }
}