import java.util.*;
public class SolidRhombus {
    public static void Pattern(int Lines){
        for(int i = 1; i<=Lines; i++){
            for(int j = 1; j<= Lines -i;j++){
            System.out.print(" ");
            }
            for (int j = 1; j<= Lines;j++){
                System.out.print("*");
            }
        System.out.println();  
        }
    }
    public static void main(String args[]){
    Pattern( 9);
    }}
