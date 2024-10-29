// Program of transpose of a matrix
public class problem3 {
    public static void transpose(int arr[][]){
        int transpose[][] = new int[arr[0].length][arr.length];

        for(int i = 0;i<transpose.length;i++){
            for(int j = 0; j<transpose[0].length;j++){
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println();
        print(transpose);
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
        int arr[][] = { {1,2,3,4}, {5,6,7,8},{9,10,11,12}};
        print(arr);
        transpose(arr);
    }
}
