// Program to check if an array is sorted or not
public class Problem5 {
    public static boolean array(int arr[] , int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return array(arr, i+1);
    }
    public static void main(String args[]){
        int arr[] = {1 ,2 ,3 ,4,5,6,7,4};
        System.out.println(array(arr, 0));
        System.out.println(arr.length);
    }
}
