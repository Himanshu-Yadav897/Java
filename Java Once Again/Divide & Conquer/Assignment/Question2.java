// Given an array nums of size n, return the majority element.
// The element is the element that appears more than [n/2] times. You may assume that the majority
// element alawyas exist in the array.
// https://leetcode.com/problems/majority-element/description/
public class Question2 {
    public static int getCount(int arr[], int si, int ei, int target) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static int majority(int arr[], int si, int ei){
        if(si == ei){
            return arr[si];
        }

        int mid = si + (ei - si)/2;
        int ansA = majority(arr, si, mid);
        int ansB = majority(arr, mid+1, ei);

        int countA = getCount(arr, si, mid, ansA);
        int countB = getCount(arr, mid+1, ei, ansB);

        if(countA > countB){
            return ansA;
        }else{
            return ansB;
        }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 6, 2, 6, 2, 2, 2, 3, 6, 6, 6, 6, 6, 3, 7 };
        int result = majority(arr, 0, arr.length-1);
        System.out.println(result);
    }
}
