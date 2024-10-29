//Print number from 1 to n(Increasing Order)
public class Problem2 {
    public static void Print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        Print(n-1);
        System.out.print(n + " ");
        
    }
    public static void main(String args[]){
        int n = 15;
        Print(n);
    }
}
