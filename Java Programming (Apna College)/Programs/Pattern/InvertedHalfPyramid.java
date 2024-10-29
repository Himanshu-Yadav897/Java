import java.util.*;
public class InvertedHalfPyramid {
    public static void Pattern(int TotRows){
        for(int i = 1; i<=TotRows; i++){
            for(int j = 1; j<=TotRows - i; j++){
                System.out.print(" ");
            }
        for(int k = 1; k <= i; k++){
            System.out.print("*");
        }  
        System.out.println();  
        }
    }
    public static void main(String args[]){
    Pattern( 20 );
    }}
