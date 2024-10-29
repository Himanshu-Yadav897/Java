//Given an array of size n, find the total number of occurrences of given number x.

import java.util.Scanner;

public class Problem17 {
    public static int occurrences(int arr[], int value){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] == value){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter 6 elements of array:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing Element is : "+ occurrences(arr , 9));
    }
}
