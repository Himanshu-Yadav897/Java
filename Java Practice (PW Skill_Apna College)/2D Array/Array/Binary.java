// Program of Binary Search
public class Binary {
    public static int Search(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]>key ){
                end = mid-1;
            }else if(arr[mid] < key){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int i =0;
        while(i <= 10){
            System.out.printf("%d is in the array  : arr[%d] \n", i , Search(arr, i)) ;
            i++;
        }

    }    
}
