import java.util.*;
public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     if (n ==2){
        System.out.println("This is an prime number");
     }
     else {
        boolean prime = true;
        for (int i = 2; i <= n-1;i++){   // we can also use for(int i = 2; i <=Math.sqrt(n); i ++)
            if(n%i == 0){
               prime = false;
            }
        
    } if (prime ==true){
        System.out.println("this is an prime number");
    } else {
        System.out.println("This is not a prime number");
    }
     }
    }
}

