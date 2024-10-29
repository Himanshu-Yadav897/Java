import java.util.*;
public class Charat {
    public static void print(String str){
        for(int i = 0; i< str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstName = "Himanshu";
        String lastName = "Yadav";
        String fullName = firstName + " " + lastName;
        print(fullName);

}
}
