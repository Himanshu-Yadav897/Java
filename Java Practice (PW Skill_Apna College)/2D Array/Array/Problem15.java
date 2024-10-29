// Given an array sorted in increasing order of size n and an integer x. Find ,if there exists a pair
//in the array whose absolute difference is exactly x.(n>1)

public class Problem15 {
    public static boolean absolute(int arr[], int value){
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                int diff = Math.abs(arr[i] - arr[j]);
                if(diff == value){
                    return true; 
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {5,10,15,20,26,29};
        System.out.println(absolute(arr, 2));
    }
}
