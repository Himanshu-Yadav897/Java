// Program to find to find the last occurence of an sorted array by Binary Search
public class Probelm6 {
    public static int LastSearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        int lo = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                lo = mid;
                start = mid+1;
            }else if( arr[mid] > key){
                end = mid-1;
            }else if(arr[mid] < key){
                start = mid +1;
            }
        }
        return lo;
    }
    public static void main(String args[]){
        int arr[] = {0,1,2,3,4,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,8,9,9};
        System.out.println(arr.length);
        System.out.println(LastSearch(arr, 9));
        System.out.println(LastSearch(arr, 6));
        System.out.println(LastSearch(arr, 4));
        System.out.println(LastSearch(arr, 8));
    }
}
