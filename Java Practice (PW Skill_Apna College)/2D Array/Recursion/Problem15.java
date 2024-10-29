// Given two numbers x and y . Find the greatest Common Divisor of x and y using Recursion .
// BY Euclid's Method (GCD)
// To Find LCM--->  LCM = (x * y)/ gcd 
import java.util.Scanner;

public class Problem15 {
    public static int GCD(int x, int y){
        if(y == 0){
            return x;
        }

        return GCD(y, x%y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(GCD(x,y));
    }
}
