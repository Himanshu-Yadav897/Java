// Print All Prime Numbers in Range

public class Problem3 {
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

    public static void range(int n){
        for(int i = 1; i <= n; i++){
            if(Prime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
    range(100);
    }
}
