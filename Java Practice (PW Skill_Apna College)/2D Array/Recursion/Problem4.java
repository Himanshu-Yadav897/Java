// Program to find nth fibonacci number
public class Problem4 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {// Optimized way is that if you write it like this 
        //     if(n<=1){
        //     return n
        // }
            return n;
        }

        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;

    }

    public static void main(String args[]) {
        System.out.println(fibonacci(48));
    }
}
