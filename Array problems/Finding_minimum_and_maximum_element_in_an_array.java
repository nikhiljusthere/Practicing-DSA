//  Find minimum and maximum element in an array
//  https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1


class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
       
        long min = 0;
        long max = 0;
        max = min = a[0];
        
        for (int i = 1; i < n; i++)
        {
            if (a[i] > max)
            max = a[i];
            
            if (a[i] < min)
            min = a[i];
            
            
        }
        
        return new Pair(min,max);
    }
}

