package Pattern;
//Code to print successive star pattern taking input from user

import java.util.Scanner;

public class Successive_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numrows = sc.nextInt();
        printstarpattern(numrows);
        sc.close();
    }

    public static void printstarpattern(int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}
