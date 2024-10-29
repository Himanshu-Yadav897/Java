// Given an integer array nums, return true if any value appears at least twice in 
// the array, and return false if every element is distinct
// Example 1:
// Input:nums = [1, 2, 3, 1]
// Output:   true

// Example 2:
// Input:nums = [1, 2, 3, 4]
// Output:   false

// Example 3:
// Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Output:   true
import java.util.*;
public class Problem9 {
    public static boolean duplicate(int arr[]){
        Arrays.sort(arr);
        for(int i =0; i<arr.length-1;i++){
            if(arr[i+1] == arr[i]){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(duplicate(arr));
        }
}
