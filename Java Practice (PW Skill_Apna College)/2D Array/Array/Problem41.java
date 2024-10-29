// Check if we can partition the array into two subarrays with equal sum.
// More formally, check that the prefix sum of a part of the array is equal to the suffix sum 
// of rest of the array.

import java.util.*;

public class Problem41 {

    public static boolean partition(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            ts = ts + arr[i];
        }

        int prefix = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            prefix = prefix + arr[i];
            int suffix = ts - prefix;

            if (prefix == suffix) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(partition(arr));

    }
}
