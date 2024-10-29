import java.util.*;
public class CharacterPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        char ch = 'A';
       for(int lines = 1; lines<=n; lines++){
            for(int chars = 1; chars <= lines ;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
       }
        
    }
}
