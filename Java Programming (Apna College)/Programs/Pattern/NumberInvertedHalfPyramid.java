import java.util.*;
public class NumberInvertedHalfPyramid {
    public static void Pattern(int TotRows){
        for(int i = 1; i<=TotRows; i++){
            for(int j = 1; j<= TotRows - i  +1;j++){
                System.out.print(j);
            }
        System.out.println();  
        }
    }
    public static void main(String args[]){
    Pattern( 9);
    }}
