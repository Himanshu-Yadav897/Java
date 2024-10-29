import java.util.*;
public class InputParameters {
    public static int CalculateSum(int a , int b) // Parameters or Formal Parameters
    {
        return a + b ;
       
    }
    public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int sum = CalculateSum(a,b); // Actual Parameters or Arguments
   System.out.println("The sum of a and b is " + sum);
    }
    }
