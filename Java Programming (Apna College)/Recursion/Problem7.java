// Program to find the first Occurence of an element in an array.
public class Problem7 {
    public static int First(int arr[] , int key , int i){
        if( i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        int value = First(arr, key, i + 1);
        return value;
    }
    public static void main(String args[]){
        int arr[] = { 8,3,6,9,5,10,2,5,3};
        System.out.println(First(arr, 5, 0));
    }
}
