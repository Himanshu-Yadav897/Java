import java.util.*;
public class ProductFunction {
    public static int Multiply(int a , int b) // Parameters or Formal Parameters
    {
        int Product = a *b;
        return Product;
       
    }
    public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int Product = Multiply(a,b); // Actual Parameters or Arguments
   System.out.println("The Product of a and b is " + Product);
    }
    }
