import java.util.*;
public class LargestArray {
    public static int Largest(int marks[]){
         int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<marks.length; i++){
            if(largest < marks[i]){
                largest = marks[i];
            }
        } return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int marks[] = {1 ,2,3 , 8, 6, 4};
        System.out.println(" The Largest is : " + Largest(marks));
      
    }
}
