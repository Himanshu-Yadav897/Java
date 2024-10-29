import java.util.*;
public class PrimeInRange{
    public static boolean  Prime(int n){
     if(n ==2){
        return true;
     }
     for(int i=2;i<=Math.sqrt(n); i++ ){
        if(n%i==0)
        return false;
     }
     return true;
    }
    public static void PrimeRange(int n){
        for(int i=2;i<=n-1; i++ ){
            if( Prime(i))
            System.out.print(i + " ");
        }

 System.out.println(" ");
    }
    public static void main(String args[]){
PrimeRange(100);

   
    }}
