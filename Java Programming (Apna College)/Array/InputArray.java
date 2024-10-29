import java.util.*;
public class InputArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[30];
        marks[0] = sc.nextInt(); // physics
        marks[1] = sc.nextInt(); // maths
        marks[2] = sc.nextInt(); // Chemistry
        System.out.println(" Physics : " + marks[0]);
        System.out.println(" Maths : " + marks[1]);
        System.out.println("Chemistry : " + marks[2]);
        
    }
}
