import java.util.*;
public class LinearSearchTwo {
    public static int Search(String number[] , String key){
        
        for(int i =0 ; i<number.length; i++){
           if(number[i] == key){
            return i;
           }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String key = "Bread";
        String number[] = {"Bread" , "Samosa" , "Sandwich" , "Burger" , "Chai" , "Coffee"};
       int index = Search(number , key);
       if(index == -1){
        System.out.print("Your key is not in the list");
       } else{
        System.out.print("You key is on the list " + index);
       }
      
    }
}
  