import java.util.*;
public class InvertedStar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 4;
       for(int lines = 1; lines<=n; lines++){
            for(int star = 1; star <=n-lines+1 ;star++){
                System.out.print("*");
            }
            System.out.println(" ");
       }
        
    }
}
