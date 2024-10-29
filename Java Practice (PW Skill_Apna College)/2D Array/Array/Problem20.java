// Given an arr[] and an integer k where k is smaller than size of array. the task is to find
// kth smallest element in the given array. It is given that all array elements are distinct.

import java.util.*;

public class Problem20 {
    public static int kthSmallest(int arr[], int k){
        Arrays.sort(arr);

        return arr[k-1];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elemnets of an array: ");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(kthSmallest(arr, 4));

    }
}
