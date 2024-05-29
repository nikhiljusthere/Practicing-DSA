import java.util.Scanner;

public class Sum_of_elements {
    public static void main(String[] args) {
        int arr[];
        System.out.print("Enter size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Enter the element at arr[%d]: ",i);
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
        }

        System.out.printf("sum of all elements is: %d ",sum);


    }

}