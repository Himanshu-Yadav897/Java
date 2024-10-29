// Given a number n, Find the sum of natural number till n but with alternative signs.
// that means if n = 5 then you have to return 1 -2 +3-4+5 = 3
public class Problem13 {
    public static int natural(int n){
        if(n <= 0){
            return 0;
        }
        if(n%2 == 0){
            return natural(n-1) - n;
        }else{
            return natural(n-1) +n;
        }
    } 
    public static void main(String args[]){
        System.out.println(natural(10));
    }
}
