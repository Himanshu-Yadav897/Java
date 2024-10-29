// Program to find the factorial of a number

import java.util.Scanner;

public class Problem2 {
    public static int printfactt(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return n * printfactt(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      System.out.println(printfactt(n));
    }
}
