import java.util.*;
public class Fourth {
    public static int sum(int n){
      int ToSum = 0;
        while(0<n){
         int LastDigit = n%10 ;
         ToSum = ToSum + LastDigit;
         n = n / 10;
        }
      return ToSum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
        
        
    }
}

