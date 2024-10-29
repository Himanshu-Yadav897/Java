// Program to print spiral matrix
public class problem7 {
    public static void spiralMatrix(int arr[][]) {
        int startRow = 0;
        int endColumn = arr[0].length - 1;
        int endRow = arr.length - 1;
        int startColumn = 0;
        int totalElement = arr.length * arr[0].length
        ;
        int count = 0;

        while (count < totalElement) {

            for (int j = startColumn; j <= endColumn && count < totalElement; j++) {
                System.out.print(arr[startRow][j] + " ");
                count++;
            }
            startRow++;

            for (int i = startRow; i <= endRow && count < totalElement; i++) {
                System.out.print(arr[i][endColumn] + " ");
                count++;
            }
            endColumn--;

            for (int j = endColumn; j >= startColumn && count < totalElement; j--) {
                System.out.print(arr[endRow][j] + " ");
                count++;
            }
            endRow--;

            for (int i = endRow; i >= startRow && count < totalElement; i--) {
                System.out.print(arr[i][startColumn] + " ");
                count++;
            }
            startColumn++;
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

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        print(arr);
        System.out.println();
        spiralMatrix(arr);
    }
}
