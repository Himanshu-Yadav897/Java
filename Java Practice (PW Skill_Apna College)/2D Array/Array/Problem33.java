// ================= TWo Pointer Approach =======================


// Given an integer array 'a' sorted in non-decreasing order , return an array of the non - decreasing order.
// return an array if the squares of each number sorted in non - decreasing order.
public class Problem33 {
    public static int[] sort(int arr[] ){
        int i = 0;
        int j = arr.length-1;
        int ans[] = new int[arr.length];
        int k = 0;

        while(i<=j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k] = arr[i] * arr[i];
                k++;
                i++;
            }else{
                ans[k] = arr[j] * arr[j];
                k++;
                j--;
            }
        }

        return ans;
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse (int arr[]){
        int i = 0; 
        int j = arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { -10, -3, -2, 1, 4, 5 };
        System.out.println("array before the sort: ");
        print(arr);
        System.out.println("Array after the sort: ");
        int result[] = sort(arr);
        print(result);
        System.out.println("Array After the reverse: ");
        reverse(result);
        print(result);

    }
}
