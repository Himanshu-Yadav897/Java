public class Problem5 {
    public static int DecToBin(int n){
        int i = 0;
        int Bin = 0;
        while(n>0){
            int rem = n%2;
            Bin = Bin + rem * (int)Math.pow(10, i);
            i++;
            n = n/2;
        }
        return Bin;
    }
    public static void main(String args[]){
        System.out.println(DecToBin(8 ));
    }
}
