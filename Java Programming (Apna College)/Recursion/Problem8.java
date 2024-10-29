public class Problem8 {
    public static int Last(int arr[] , int key , int i){
        if( i == arr.length){
        return -1;
        }
        int Found = Last(arr, key, i+1);
        if( Found == -1 && arr[i] == key){
            return i;
        }
        return Found;
    }
    public static void main(String args[]){
        int arr[] = { 8,3,6,9,5,10,2,5,5};
        System.out.println(Last(arr, 4, 0));
    }
}
