// Program to reverse an array without extra array
public class Problem26 {
    public static void swap(int arr[]) {
        int j = arr.length-1;
        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
     public static void print(int arr[]){
        for(int i= 0; i<arr.length;i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 6, 7 };

        print(arr);
        swap(arr);
        print(arr);

    }
}
