// Program to find the largest number in an array
public class Largest {
    public static int find(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {1,12,6,3,5,9};
        System.out.println(find(arr));
    }
}
