// Given an integer array 'a' , return the sum/running sum in the sam array without 
// creating a new array.

import java.util.Scanner;

public class Problem39 {
    public static void Prefix(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Element of an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        print(arr);
        Prefix(arr);
        print(arr);
    }
}
