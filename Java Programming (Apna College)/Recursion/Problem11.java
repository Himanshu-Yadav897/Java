public class Problem11 {
    public static int Tiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
         // vertical choice
         int fnm1 = Tiling(n-1);

         // Horizontal choice
         int fnm2 = Tiling(n-2);

         int way = fnm1 + fnm2;
         return way;
    }
    public static void main(String args[]){
        System.out.println(Tiling(4));
    }
}
