// Program to understand the basic of Backtracking in recursion by changing the arr by -2
public class ChangeArr {
    public static void changeArr(int arr[] , int i , int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        changeArr(arr , i +1, val +1);
        arr[i] = arr[i] -2; // Backtracking Step

    }
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}