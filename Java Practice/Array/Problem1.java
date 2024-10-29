// Program to implement the Binary Search
import java.util.*;
public class Problem1 {
    public static int Binary(int arr[], int key) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start+ end)/ 2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                end = mid -1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }


    public static void main(String args[]) {
        int arr[] = { 3, 4, 6, 8, 2, 6, 8, 3, 26, 8,1 };
        System.out.println(Binary(arr, 26));
        System.out.println(arr.length);
    }
}