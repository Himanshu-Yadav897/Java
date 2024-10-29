// Friends Pairing problem
public class Problem13 {
    public static int Friends(int n ){
        // Base Case
        if(n == 1 || n ==2){
            return n;
        }

        // Choice
        // single
        int fnm1 = Friends(n-1);

        // Pair
        int fnm2 = Friends(n-2);
        int pairs = (n-1) * fnm2;

        int totways = fnm1 + pairs;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(Friends(4));
    }
}
