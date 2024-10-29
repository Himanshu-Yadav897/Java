// Fibonacci Number

public class ProblemTwo {
    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibo = Fibonacci(n - 1) + Fibonacci(n - 2);
        return fibo;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(11));
    }
}
