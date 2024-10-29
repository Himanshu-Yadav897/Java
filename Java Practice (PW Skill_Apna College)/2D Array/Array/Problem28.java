// // Rotate the given array 'a' by k steps, where k is non - negative number. without using any extra space.
//Note:- k can be greater than n as well.
public class Problem28 {
    public static void reverse(int arr[], int i, int j) {
       while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       }
    }

    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n ;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

    }

     public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    } 
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        rotate(arr, 4);
        print(arr);
    }
}
