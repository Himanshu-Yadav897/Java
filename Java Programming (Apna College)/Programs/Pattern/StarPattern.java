import java.util.*;
public class StarPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       for(int lines = 1; lines<=5; lines++){
            for(int star = 1; star<=lines ;star++){
                System.out.print("*");
            }
            System.out.println(" ");
       }
        
    }
}
