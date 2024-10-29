 // Sum of n natural Number
public class Problem4 {
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int fn = n + Sum(n-1);
        return fn;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(Sum(n));
    }
}
 
