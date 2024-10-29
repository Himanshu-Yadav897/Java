//Print number from n to 1(Decreasing Order)
public class Problem1 {
    public static void Print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        Print(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        Print(n);
    }
}
