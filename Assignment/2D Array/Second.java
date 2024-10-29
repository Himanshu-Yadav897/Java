import java.util.*;
public class Second{
    public static void Counting( int matrix[][]){
        int sum = 0;
            for(int j = 0; j<matrix[0].length; j++){
              sum += matrix[1][j];
               }
        System.out.println(sum);
        
    }
    public static void main(String args[]){
        int matrix[][] = { {1,4,9}, {11,4,3} , { 2,2,3}};
        Counting(matrix);
    }
    
}

