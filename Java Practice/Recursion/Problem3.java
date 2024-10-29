// Sum of its Digits

public class Problem3 {
    public static int SumOfN(int n) {
        if (n <= 0) {
            return 0;
        }

        int lastDigit = n % 10;
        int Sum = 0;
        Sum = Sum + lastDigit;
        
        return Sum + SumOfN(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(SumOfN(3));
    }
}
