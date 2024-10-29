
// Given an array arr[] of size n-1 with integers in the range of [1,N], the task
// is to find the missing number from the first N integers. There are no duplicates in the list.

import java.util.*;

public class Problem16 {
    public static int missing(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int diff =  arr[i + 1] - arr[i];
            if (diff > 1) {
                return arr[i] + 1;
            }
        }
        return -1; // if missing element doesn't exists
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter 6 elements of array:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing Element is : "+missing(arr));
    }
}
