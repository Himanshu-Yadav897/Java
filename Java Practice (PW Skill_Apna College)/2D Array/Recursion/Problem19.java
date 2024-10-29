// Print whether x exist in this array or not
public class Problem19 {
    public static boolean print(int arr[], int idx, int target){
        if(idx == arr.length){
            return false;
        }
        if(arr[idx] == target){
            return true;
        }
        
        return print(arr, idx+1, target);
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5,6,7,7};
      System.out.println(  print(arr, 0, 7));

    }
}
