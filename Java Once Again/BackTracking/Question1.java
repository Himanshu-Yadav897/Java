

public class Question1 {

    public static void changeArray(int arr[], int i , int val){
        if(arr.length == i){
            print(arr);
            return;
        }

        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] -= 2;
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        changeArray(arr, 0, 5);
        print(arr);
    }
}
