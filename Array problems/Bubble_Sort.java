import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Enter element at arr[%d]: ",i);
            arr[i] = sc.nextInt();
        }

        int temp = 0;

        for (int i = 0; i < n; i++ )
        {
            for (int j = i + 1; j < n; j++ )
            {
                if (arr[i] > arr[j])
                {
                    temp   = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print("Array in ascending order: ");

        for (int i = 0; i < n; i++)
        {
            System.out.printf("%d ",arr[i]);
        }


    }
}
