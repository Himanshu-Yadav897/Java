// Given a positive integer n, generates an n*n matrix filled with elements
// from 1 to n^2 in spiral order.
public class Problem9 {
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateSpiral(int n){
        int matrix[][] = new int[n][n];
        int startRow = 0;
        int endCol = n-1;
        int endRow = n-1;
        int startCol = 0;
        int count = 1;

        while(count <= n*n){
            for(int j = startCol;j<=endCol && count <= n*n ;j++){
                matrix[startRow][j] = count;
                count++;
            }
            startRow++;

            for(int i = startRow; i<= endRow && count <= n*n;i++){
                matrix[i][endCol] = count;
                count++;
            }
            endCol--;

            for(int j = endCol; j>= startCol && count <= n*n;j-- ){
                matrix[endRow][j] = count;
                count++;
            }
            endRow--;

            for(int i = endRow; i>= startRow && count <= n*n; i--){
                matrix[i][startCol] = count;
                count++;
            }
            startCol++;
            
        }
        return matrix;


    } 
    public static void main(String[] args) {
     int matrix[][]= generateSpiral(5);   
     print(matrix);
    }
}
