// Program to sort the array by bubble sort
public class bubble {
    public static int sort(int arr[]) {
        int n = arr.length;
        int sorting = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    sorting++;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return sorting;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        print(arr);
        int sort = sort(arr);
        System.out.println( sort);
        print(arr);
    }
}
