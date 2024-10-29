// Program to find the sum of n natural number
import java.util.*;
public class Problem3 {
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int sumofn = n + sum(n-1);
        return sumofn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
