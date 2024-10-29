import java.util.*;
public class First{
    public static void Counting( int matrix[][] , int key){
        int count = 0;
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                   count++;
                }
                
            }
          
        }
        System.out.println(count);
        
    }
    public static void main(String args[]){
        int matrix[][] = {  { 4, 7, 8} , { 8, 8,7}};
         Counting(matrix, 8);
    }
    
}

