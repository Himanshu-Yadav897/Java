// Given a matrix 'a' of dimension n X m and 2 coordinates (l1,r1) to (l2,r2).
// Return the sum of the rectangle from (l1,r1) to (l2,r2).

// Brute force approach
public class Problem10 {
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[0].length; j++) {
                  System.out.print(arr[i][j] + " ");
              }
              System.out.println();
          }
      }
      public static int sum(int matrix[][], int l1,int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i<= l2;i++){
            for(int j = r1; j<= r2;j++){
                sum += matrix[i][j];
            }
        }
        return sum;
      }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int sum = sum(matrix, 2, 0, 3,2 );
        System.out.println(sum);
        
    }
}
