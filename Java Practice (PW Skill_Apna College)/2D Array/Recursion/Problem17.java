// Print the maximum of the array[3,10,3,2,5]
// Recursive java program to find maximum element in an array
public class Problem17 {
    public static int print(int arr[], int idx){
      // Base CAse
      if(idx == arr.length-1){
        return arr[idx];
      }
      int SmallAns = print(arr, idx+1);
      return Math.max(arr[idx] , SmallAns);
        
    }
    public static void main(String args[]){
        int arr[] = {3,10,302,2,5,98};
       System.out.println( print(arr, 0));
    }
}
