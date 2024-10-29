// Given an array, print all its Value Recursively.
public class Problem16 {
    public static void Print(int arr[] , int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        Print(arr, idx+1);
    }
    public static void main(String args[]){
        int art[] = {1,2,3,45,6,7,7,8,};
        Print(art, 0);
    }
}
