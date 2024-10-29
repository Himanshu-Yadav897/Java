// Program To print the sum of an array using recursion
public class Problem18 {
    public static int Sum(int arr[] , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int sum = arr[idx] + Sum(arr,idx+1);
        return sum;
    }
    public static void main(String args[]){
        int arr[] = {0,01,2,3,4,5,6,7,8,9,10,-2,0};
        System.out.println(Sum(arr, 0));
    }
}
