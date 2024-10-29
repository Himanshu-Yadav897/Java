import java.util.*;
public class ArrayFunctionArguments {
    public static void update(int marks[]){
        for(int i =0 ; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int marks[] = {1 ,2,3};
        update(marks);
        for(int i = 0; i <marks.length; i++ ){
            System.out.println(marks[i]);
        }
    }
}
