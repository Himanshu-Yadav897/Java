// Find the total number of pairs in the Array whose sum is equal to the given value x.
public class Problem10 {
    public static int pair(int arr[], int value){
        int count = 0;
        for(int i=0; i<arr.length;i++){
            for(int j = i+1; j <arr.length;j++){
                if(arr[i] + arr[j] == value){
                   count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {1,3,9,6,3,4,2,9};
        System.out.println(pair(arr, 11));
    }
}
