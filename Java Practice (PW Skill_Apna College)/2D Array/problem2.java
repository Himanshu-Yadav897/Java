// program of matrix multiplication

public class problem2 {
    public static void matrix(int arr[][] , int arr1[][]){

        if(arr[0].length != arr1.length){
            System.out.println("Matrix Multiplication cannot bee done");
            return;
        }
         int c[][] = new int[arr.length][arr1[0].length];
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr1[0].length;j++){
                for(int k = 0; k<arr[0].length;k++){
                    c[i][j] += (arr[i][k] * arr1[k][j]); 
                }
            }
        }
        print(c);
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
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int arr1[][] = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 }, { 20, 21, 22 } };
        matrix(arr, arr1);
    }
}
