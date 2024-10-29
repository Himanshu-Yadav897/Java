// Given an integer, Find out the sum of its digits using recursion

import java.util.Scanner;

public class Problem10 {
    public static int SumofDigits(int n){
        if(n >= 0 && n<= 9){
            return n;
        }
        return SumofDigits(n/10) + n%10;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumofDigits(n));
    }
}
