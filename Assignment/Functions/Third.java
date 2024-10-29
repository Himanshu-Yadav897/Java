import java.util.*;
public class Third {
    public static void reverse(int n){
        int rev = 0;
        int number = n;
        while(0<n){
         int LastDigit = n%10 ;
         rev = (rev*10) + LastDigit;
         n = n / 10;
        }
        if(rev == number){
            System.out.println("Yes, This is an palindrome " + number + "=" + rev);
        }else{
            System.out.println("No, This is not an palindrome " + number + "=" + rev);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        reverse(n);
        
        
    }
}

