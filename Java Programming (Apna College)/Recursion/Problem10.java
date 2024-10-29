// Optimized Code For problem 10
public class Problem10 {
    public static int power(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfpower = power(a,n/2);
        int halfpowersq = halfpower * halfpower;
         if(n %2 != 0){
            halfpowersq = a * halfpowersq;
         }
         return halfpowersq;
    }
    public static void main(String args[]){
        System.out.println(power(2,5));
    }
}
