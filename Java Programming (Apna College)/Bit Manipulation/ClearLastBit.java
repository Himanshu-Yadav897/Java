// Clear Last ith Bit
public class ClearLastBit {
    public static int ith(int n , int i){
        int bitmask = ((~1)<<i);
    return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(ith(15,1));
    }
}

