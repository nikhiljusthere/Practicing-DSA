//  Find minimum and maximum element in an array
//  https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1


class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        Arrays.sort(a);
        
        long min = 0;
        long max = 0;
        min = a[0];
        max = a[(int)(n-1)];
        return new Pair(min,max);
        
    }
}
}
