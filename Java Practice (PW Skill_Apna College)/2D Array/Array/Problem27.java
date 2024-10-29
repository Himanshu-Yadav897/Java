// Rotate the given array 'a' by k steps, where k is non - negative number.
//Note:- k can be greater than n as well.
public class Problem27 {
    public static int[] rotate(int arr[],int k){
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j =0;
        for(int i = n-k; i<n;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    } 
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int ans[] = rotate(arr, 308);
        print(ans);

    }
}
