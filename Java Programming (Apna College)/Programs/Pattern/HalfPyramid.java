import java.util.*;
public class HalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 9;
       for(int lines = 1; lines<=n; lines++){
            for(int number = 1; number <= lines ;number++){
                System.out.print(number);
            }
            System.out.println(" ");
       }
        
    }
}
