import java.util.*;
public class BinToDec{
    public static void BinaryToDecimal(int n){
    
    int powr = 0;
    int dec = 0;
    while(n>0){
       int LastDigit = n % 10;
       dec = dec + (LastDigit * (int) Math.pow(2,powr));
      
       powr++;
       n = n/10;

    }
    System.out.println(dec);
    
    }
     
    public static void main(String args[]){
BinaryToDecimal(101);

   
    }}
