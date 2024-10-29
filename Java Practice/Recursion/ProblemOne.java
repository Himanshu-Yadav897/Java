//  Factorial of  n 
public class ProblemOne {
    public static int Factt(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = n * Factt(n - 1);

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(Factt(10));
      
    }
}
