// // Given an unsorted array A of size N that contains only non-negative integers, find a 
//  continuous sub-array which adds to a given number S.
//  In case of multiple subarrays, return the subarray which comes first on moving from left 
//  to right.
//  You need to print the start and end index of answer subarray.

public class Problem21 {
    public static int[] find(int arr[], int S){
        int start = 0; 
        int end = 0;
        int Sum = arr[0];
        while(end < arr.length){
            if(Sum == S){
                return new int[]{start,end};
            }else if(Sum < S){
                end++;
                if(end < arr.length){
                    Sum = Sum + arr[end];
                }
            }else{
                Sum = Sum - arr[start];
                start++;
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int arr[] = {1,4,20,3,10,5};
        int Sub[] = find(arr, 33);
        System.out.println("[" + Sub[0] + "," + Sub[1]+ "]");

    }
    
}
