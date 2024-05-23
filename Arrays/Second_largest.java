//  Second Largest
//  https://www.geeksforgeeks.org/problems/second-largest3735/1


class Solution {
    int print2largest(int arr[], int n) {
       
       if (n < 2)
       {
           return -1;
       }
       int one = 0;
       int two = 0;
       
       for (int i = 0; i < n; i++)
       {
           if (arr[i] > one)
           {
               two = one;
               one = arr[i];
               
           }
           
           else if (arr[i] > two && arr[i] != one)
           {
               two = arr[i];
               
           }
           
       }
           if (two == 0)
           {
               two = -1; 
           }
           return two;
       
        
    }
    
}