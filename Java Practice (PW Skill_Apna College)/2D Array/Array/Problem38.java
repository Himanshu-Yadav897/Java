// Prefix Array with new array

import java.util.Scanner;

public class Problem38 {

    public static int[] Prefix(int arr[]) {
        int pref[] = new int[arr.length];
        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref;

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
        int pref[] = Prefix(arr);

        print(pref);
    }
}
