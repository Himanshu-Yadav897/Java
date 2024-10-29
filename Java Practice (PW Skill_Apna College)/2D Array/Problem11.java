// Given a matrix 'a' of dimension n X m and 2 coordinates (l1,r1) to (l2,r2).
// Return the sum of the rectangle from (l1,r1) to (l2,r2).

// Pre- Calculating the horizontal sum for each row in matrix
public class Problem11 {
    public static void prefix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] += matrix[i][j - 1];
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

    public static int sum(int matrix[][],int l1,int r1, int l2, int r2){
        int sum = 0; 

        for(int i = l1; i<=l2;i++){
            if(r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1];
            }else{
                sum += matrix[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        print(matrix);
        prefix(matrix);
        System.out.println();
        print(matrix);
        int sum = sum(matrix, 2, 0, 3,2 );
        System.out.println(sum);
    }
}
