public class Problem11 {
    public static void pattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                if(i==n|| i==1|| (j == 1) || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}