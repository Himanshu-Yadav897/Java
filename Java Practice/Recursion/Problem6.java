// Given a number num and a value of k. Print K multiples of num.
public class Problem6 {
    public static void print(int num, int k){
        if(k == 0){
            return;
        }
        print(num, k-1);
        System.out.println(num * k);
    }
    public static void main(String[] args) {
        print(5, 9);
    }
}
