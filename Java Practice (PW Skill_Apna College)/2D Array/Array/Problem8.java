// Count the number of elements strictly greater than value x.
public class Problem8 {
    public static int greater(int arr[], int value){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] > value){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,9,6,2,5,7,8,5,3,7,0,5,4,6,7,11};
        System.out.println(greater(arr, 6));
    }
}
