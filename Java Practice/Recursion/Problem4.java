

public class Problem4 {
    public static int pow(int p, int q){
        if(q == 0){
            return 1;
        }

        return pow(p, q-1) * p;
    }
   public static void main(String[] args) {
    System.out.println(pow(5, 10));
    System.out.println(Math.pow(5, 10));
   } 
}
