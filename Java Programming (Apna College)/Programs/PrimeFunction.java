import java.util.*;
public class PrimeFunction {
    public static boolean  Prime(int n){
     if(n ==2){
        return true;
     }
     for(int i=2;i<=n-1; i++ ){
        if(n%i==0)
        return false;
     }
     return true;
    }
    public static void main(String args[]){
    System.out.println(Prime(117));
   
    }}
