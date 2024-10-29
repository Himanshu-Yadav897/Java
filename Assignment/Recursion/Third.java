//Write a program to find Length of a String using Recursion
public class Third {
    public static void print(String str , int len ){
        if(len == str.length()){
            System.out.println(len);
            return;
        }

        print(str, len + 1);
    }
    public static void main(String args[]){
        String str = "Hello World";
        print(str, 0);
    }
}
