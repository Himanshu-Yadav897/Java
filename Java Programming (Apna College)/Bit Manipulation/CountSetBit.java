// Check if a number is a power of tywo or not
public class CountSetBit {
    public static int SetBit(int n ){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(SetBit(15));
    }
}

