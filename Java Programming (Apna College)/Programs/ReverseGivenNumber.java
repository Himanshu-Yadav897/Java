import java.util.*;
public class ReverseGivenNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = 10899;
        int rev = 0;
        while(0<number){
         int LastDigit = number%10 ;
         rev = (rev*10) + LastDigit;
         number = number / 10;
        }
        System.out.print(rev);
        
        
    }
}

