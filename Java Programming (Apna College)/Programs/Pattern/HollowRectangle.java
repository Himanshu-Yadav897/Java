import java.util.*;
public class HollowRectangle {
    public static void Pattern(int TotRows , int TotCols){
        for(int i = 1; i<=TotRows; i++){
            for(int j = 1; j<= TotCols; j++){
                if(i == 1 || i == TotRows || j ==1 || j ==TotCols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Pattern( 7 , 10);
    }}
