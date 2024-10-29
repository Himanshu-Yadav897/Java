import java.util.*;
public class Factorial {
    public static int Factorial(int n){
    int f = 1;
        for(int i = 1; i <= n; i++){
            f = f*i;       
         }
            return f;
    }
    public static int BinCoeff(int n , int r){
        int facttn = Factorial(n);
        int facttr = Factorial(r);
        
        int facttn_r = Factorial(n-r);
        int bincoeff =  facttn / (facttr * facttn_r);
        return bincoeff;
    }
    public static void main(String args[]){
        int n =5;
        int r = 2;
  int BInomialCoefficient = BinCoeff(n , r);
   System.out.println(BInomialCoefficient);
    }}
