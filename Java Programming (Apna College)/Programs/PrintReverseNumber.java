import java.util.*;
public class PrintReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = 10899;
        while(0<number){
         int LastDigit = number%10 ;
         System.out.print(LastDigit);
         number = number / 10;
        }
        
        
    }
}

