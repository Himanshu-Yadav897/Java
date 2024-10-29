import java.util.*;
public class LinearSearch {
    public static int Search(int number[] , int key){
        
        for(int i =0 ; i<number.length; i++){
           if(number[i] == key){
            return i;
           }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int key = 2;
        int number[] = {1 ,2,3 , 8, 6, 4};
       int index = Search(number , key);
       if(index == -1){
        System.out.print("Your key is not in the list");
       } else{
        System.out.print("You key is on the list " + index);
       }
      
    }
}
  