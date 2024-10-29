
// Program to print n numbers with recursion (both Ascending order and Decending order.)

import java.util.Scanner;

public class Problem1 {

    public static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);

        print(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
