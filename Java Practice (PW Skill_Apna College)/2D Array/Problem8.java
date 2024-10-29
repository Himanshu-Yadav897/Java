// Program to find the diagonal Sum in 2D array (optimized Code)
public class Problem8 {
    public static int diagonal(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];

            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - i - 1];
            }

        }
        return sum;
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 12, 23, 34, 34 }, { 98, 76, 54, 32 }, { 25, 69, 74, 36 }, { 68, 54, 37, 74 } };
        print(arr);
        int sum = diagonal(arr);
        System.out.println(sum);
    }
}
