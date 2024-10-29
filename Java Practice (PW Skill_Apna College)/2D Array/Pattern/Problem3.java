import java.util.Scanner;

public class Problem3 {
    public static void pattern(int n){
        char ch = 'A';
        for(int i =1; i<=n; i++){
           for(char j =1; j <=i; j++){
            System.out.print(ch);
            ch++;
           }
           System.out.println();
    }}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}


