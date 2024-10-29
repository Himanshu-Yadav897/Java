

public class Problem1 {
    public static int nFriend(int n){
        if( n == 1 || n ==2){
            return n;
        }

        int nPair = nFriend(n-1) + nFriend(n-2);
        return nPair;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(nFriend(n));

    }
}
