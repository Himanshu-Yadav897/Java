// Problem to check an Prime Number (Optimized)

public class Problem2 {
    public static boolean Prime(int n){
        if(n == 2){
            return true;
        }
        for(int i= 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(Prime(11));
    }
}
