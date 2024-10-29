import java.util.*;
public class DecToBin{
    public static void BinaryToDecimal(int n){
    
    int powr = 0;
    int bin = 0;
    while(n>0){
       int rem = n % 2;
       bin = bin + (rem * (int) Math.pow(10,powr));
      
       powr++;
       n = n/2;

    }
    System.out.println(bin);
    
    }
     
    public static void main(String args[]){
BinaryToDecimal(5);

   
    }}
