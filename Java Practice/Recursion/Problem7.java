// Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer
public class Problem7 {
    public static int Sum(int n){
        if(n == 0 ){
            return 0;
        }
        if(n % 2 == 0 ){
            return  Sum(n-1) - n;
        }else{
            return Sum(n-1) + n;
        }

    }
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
