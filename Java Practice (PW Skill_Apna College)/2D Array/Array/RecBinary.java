// Program of Binary Search by Recursion
public class RecBinary {
    public static int Binary(int arr[], int start, int end, int key){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == key){
            return mid;
        }

        if(arr[mid] > key){
            return Binary(arr, start, mid-1, key);
        }
        if(arr[mid] < key){
            return Binary(arr, mid+1, end, key);
        }

        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Binary(arr, 0, arr.length-1, 9));
        
    }
}
