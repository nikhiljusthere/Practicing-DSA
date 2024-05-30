//  344. Reverse String
//  https://leetcode.com/problems/reverse-string/description/

class Solution {
    public void reverseString(char[] s) {

        char[] r;
        int n = s.length;
        Scanner sc = new Scanner(System.in);
        char temp = 0;
        System.out.print("[");
        for (int i = 0; i < s.length/2; i++)
        {   
            temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;


            System.out.print("\"" + s[i] + "\"");
            if (i < s.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}