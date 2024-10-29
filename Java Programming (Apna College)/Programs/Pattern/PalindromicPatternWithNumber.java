import java.util.*;
public class PalindromicPatternWithNumber {
    public static void Pattern(int n){
        for(int i = 1; i<=n; i++){
            //Spaces
            for(int j = 1; j<=n - i; j++){
                System.out.print(" ");
            }
            //Descending
           for(int j =i; j>=1; j--){
            System.out.print(j);
           }
           for(int j =2; j<=i; j++){
            System.out.print(j);
           }
        System.out.println();  
    }
    }
    public static void main(String args[]){
    Pattern( 9);
    }}
