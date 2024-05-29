import java.util.Scanner;

public class Reversing_array {
    public static void main(String[] args) {

        int[] arr;
        int[] rev;
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = sc.nextInt();
        arr = new int[n];
        rev = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.printf("Enter element at arr[%d]: ",i);
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Reversed Array is; ");

        for (int i = 0; i < n; i++)
        {
            rev[i] = arr[n-i-1];
            System.out.printf("%d ",rev[i]);
        }


    }
    
}
