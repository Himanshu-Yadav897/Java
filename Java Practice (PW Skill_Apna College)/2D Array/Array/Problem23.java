// Given 2 integers a and b . Swap the 2 given values using temporary variables.
public class Problem23 {
    public static void swap(int a, int b) {
        int temp;
        System.out.println("Before Swap: ");
        System.out.println("a = " + a + " b= " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: ");
        System.out.println("a = " + a + "b=" + b);

    }

    public static void main(String args[]) {
        int a = 3;
        int b = 9;
        swap(a, b);
    }
}
