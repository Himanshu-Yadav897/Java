// Program to find Nth no. of Fibonacci Series
 public class Problem5 {
    public static int fib(int n){
        if(n == 1 || n == 0){
            return n;
        }
      int fnm1 = fib(n-1);
      int fnm2 = fib(n-2);
      return fnm1 + fnm2;
    }
    public static void main(String args[]){
        int n = 25;
        System.out.println(fib(n));
    }
} 
 
