//  Given an array arr[] of size n, find the first repeating element. 
// The element should occur more than  once and the index of its first occurrence should be the smallest.
//  If no repeating element exists, print -1. (Assume 1 based indexing).
// Input 1:
// n = 7
// arr[] = {1, 5, 3, 4, 3, 5, 6}
// Output 1:
// 2
// Input 2:
// n = 4
// arr[] = {2, 5, 3, 4}
// Output 2:
// -1
public class Problem29 {
    public static int repeating(int arr[]) {
        int n = arr.length;
        int maxElement = 0;

        for(int i = 0; i< n;i++){
            maxElement = Math.max(maxElement, arr[i]);
        }

        int frequencyArr[] = new int[maxElement + 1];

        for (int i = 0; i < n; i++) {
                frequencyArr[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (frequencyArr[i] == 2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 3, 5, 6 };
        System.out.println(repeating(arr));
    }
}
