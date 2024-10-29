// Swap the 2 given values using sum and difference method

public class Problem24 {
    public static void swap(int a, int b) {
        System.out.println("Before Swap: ");
        System.out.println("a = " + a + " b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: ");
        System.out.println("a = " + a + "b=" + b);

    }

    public static void main(String args[]) {
        int a = 3;
        int b = 9;
        swap(a, b);
    }
}
