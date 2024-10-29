// WAP too Reverse using an extra array
public class Problem25 {
    public static void reverse(int arr[]) {
        int arr1[] = new int[arr.length];
        int j = 0;
       for(int i =arr.length-1; i>=0;i--){
        arr1[j++] = arr[i];
       }
        print(arr1);
    }

    public static void print(int arr[]){
        for(int i= 0; i<arr.length;i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        reverse(arr);

    }
}
