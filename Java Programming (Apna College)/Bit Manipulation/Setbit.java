// Set ith bit
public class Setbit {
    public static int ith(int n , int i){
        int bitmask = 1<<i;
    return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(ith(10,2));
    }
}
