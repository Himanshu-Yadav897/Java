
public class Problem1 {

    public static void changeArr(int arr[],int idx , int var){

        // base Case
        if(arr.length == idx){
            return;
        }

        arr[idx] = var;
        changeArr(arr, idx+1, var+1); // Recursion step
        arr[idx] -= 2 ; // BAcktracking step
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]  = new int[5];

        changeArr(arr, 0,1);
        print(arr);
    }    
}
