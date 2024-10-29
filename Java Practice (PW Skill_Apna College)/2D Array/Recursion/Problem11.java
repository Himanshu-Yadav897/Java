// REturn the counts of digits in a given number n  :- 6363891 , Output :- 7
import java.util.*;
public class Problem11 {
    public static int Count(int n){
     // Method 1:-
    //     if(n==0){
    //        return 0;
    //     } 
      
    //     return 1 + Count(n/10);
    // } 


    // Method 2:-
    if(n<10){
        return 1;
    }

    return 1+ Count(n/10);
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Count(n ));
    }
}
