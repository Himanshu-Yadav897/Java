// Given an array of integers of size n, Answer q queries where you need to print the sum of values
// in a given range of indices from L or R (both included).
//N= Note :- The values of L and R in queries follow 1-based indexing.

import java.util.Scanner;

public class Problem40 {

    public static int[] prefix(int arr[]) {
        int pref[] = new int[arr.length];
        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the elements of an array: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int pref[] = prefix(arr);

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the starting Index(L) : ");
            int L = sc.nextInt();
            System.out.println("Enter the Ending Index (R): ");
            int R = sc.nextInt();

            System.out.println("Sum of the Value of L and R is : ");
            System.out.println(pref[R] - pref[L - 1]);
            q--;

        }
    }
}
