// Check if the given array is sorted or not
public class Problem9 {
    public static boolean Sorted(int arr[]){
        for(int i =0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {3,4,6,8,6};
        System.out.println(Sorted(arr));
    }
}
