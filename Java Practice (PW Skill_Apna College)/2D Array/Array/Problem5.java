// Program to find the first occurence of an sorted array by Binary Search
public class Problem5 {
    public static int firstSearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        int fo = -1;

        while(start <=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == key){
                fo = mid;
                end = mid-1;
            }else if(key>arr[mid]){
                start = mid+1;
            }else if(key <arr[mid]){
                end = mid-1;
            }
        }
        return fo;
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,5,5,6,7,8,9,10};
        System.out.println(firstSearch(arr, 9));
    }
}
