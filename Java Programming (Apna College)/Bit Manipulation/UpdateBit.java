// Update ith Bit
public class UpdateBit {
    public static int Clearbit(int n , int i){
        int bitmask = ~(1<<i);
    return n & bitmask;
    }
    public static int SetBit(int n , int i){
        int bitmask = 1<<i;
    return n | bitmask;
    }
public static int Update(int n, int i, int nb){
    // if (nb == 0){
    //     return Clearbit(n, i);
    // }else {
    //     return SetBit(n, i);
    // }
    n = Clearbit(n, i);
    int BitMask = nb<<i;
    return n| BitMask;
}
    public static void main(String args[]){
        System.out.println(Update(10,2,1));
    }
}
