//Given an array 'a' Consisting of Integers, Return the first value that is repeating in this array
// if no value is being repeated (return -1)
public class Problem14 {
    public static int Repeat(int arr[]){
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {6,8,1,2,5,3,3,2};
        System.out.println(Repeat(arr));
    }
}
