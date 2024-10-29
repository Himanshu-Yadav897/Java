public class Problem4 {
    public static int BinToDec(int n){
        int dec = 0;
        int i = 0;
        while(n>0){
            int LD = n%10;
            dec = dec + LD*(int)Math.pow(2, i);
            n = n/10;
            i++;
        }
        return dec;
    }
    public static void main(String args[]){
        System.out.print(BinToDec(111));
    }
}
