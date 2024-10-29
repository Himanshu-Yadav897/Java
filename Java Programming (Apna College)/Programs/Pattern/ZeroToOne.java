import java.util.*;
public class ZeroToOne {
    public static void Pattern(int TotRows){
        int counter = 1;
        for(int i = 1; i<=TotRows; i++){
            for(int j = 1; j<= i;j++){
                if((i+j)%2 ==0 ){
                System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
        System.out.println();  
        }
    }
    public static void main(String args[]){
    Pattern( 9);
    }}
