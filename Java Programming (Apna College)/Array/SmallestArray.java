import java.util.*;
public class SmallestArray {
    public static int Smallest(int marks[]){
         int smallest = Integer.MAX_VALUE;
        for(int i =0 ; i<marks.length; i++){
            if(smallest > marks[i]){ 
                smallest = marks[i];
            }
        } return smallest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int marks[] = {1 ,2,3 , 8, 6, 4};
        System.out.println(" The Largest is : " + Smallest(marks));
      
    }
}
