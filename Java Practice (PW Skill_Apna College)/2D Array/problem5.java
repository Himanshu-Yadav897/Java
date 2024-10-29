// Given a square matrix turn it by 90 degrees in a clockwise
// direction without using any extra spaces.
// Program of transpose of a matrix inplace (only for square matrix)
public class problem5 {
    public static void transpose(int arr[][]) {

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotation(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr[0].length - 1; j < arr[0].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                k--;
            }
        }
    }

    

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        print(arr);
        transpose(arr);
        System.out.println();
        print(arr);
        System.out.println();
        rotation(arr);
        print(arr);
    }
}
