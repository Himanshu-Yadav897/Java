import java.util.*;
public class Matrices{
    public static void Search( int matrix[][] , int key){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                    System.out.print("Found at the Index : " + "(" + i + "," + j + ")");
                }
                
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length ;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, 5);
    }
}