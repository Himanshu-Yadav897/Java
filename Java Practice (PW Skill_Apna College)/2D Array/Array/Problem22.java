// Write a Java program to test the equality of two arrays.

import java.util.Scanner;

public class Problem22 {
    public static boolean equal(int arr1[] , int arr2[]){
        for(int i =0; i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr1: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of arr2: ");
        int n = sc.nextInt();

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        System.out.println("Enter the elements of arr1: ");
        for(int i =0; i<m;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of arr2: ");
        for(int j =0; j< n; j++){
            arr2[j] = sc.nextInt();
        }

        System.out.println(equal(arr1, arr2));
    }
}
