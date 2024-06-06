//  125. Valid Palindrome
//  https://leetcode.com/problems/valid-palindrome/description/


class Solution {
    public boolean isPalindrome(String s)
    {
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int n = str.length();
        char[] str2 = new char[n];

        for (int i = 0; i < n; i++)
        {
            str2[i] = str.charAt(i);
        }

        for (int i = 0; i < n/2; i++)
        {
            if (str2[i] != str2[n-i-1])
            {
                System.out.printf("\"" +"%c"+ "\"" + "is not a palindrome",str2[i]);
                return false;
            }
        }

        System.out.printf("\"" +"%s"+ "\"" + "is a palindrome",new String(str2));
        return true;
    }
}