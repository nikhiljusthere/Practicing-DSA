
/*
    Print alternate elements of an array
    https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1

*/
class GfG
{
    public static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i=i+2) {
            System.out.print(arr[i]+" " );
        }
    }
}