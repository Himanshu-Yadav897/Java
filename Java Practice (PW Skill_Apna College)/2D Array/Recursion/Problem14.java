// Given two numbers x and y . Find the greatest Common Divisor of x and y using loop .
// BY long Divison Method
// GCD(Greatest Common Divisor)
import java.util.Scanner;

public class Problem14 {
    public static int GCD(int x , int y){
        int rem;
        while(x%y != 0){
            rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(GCD(x, y));
    }
}
