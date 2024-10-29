import java.util.*;
public class reverseString {
    public static void reverse(char ch[]){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<ch.length; i++){
            s.push(ch[i]);
        }

        int idx = 0;
        while(!s.isEmpty()){
            ch[idx] = s.pop();
            idx++;
        }
    }
    public static void print(char ch[]){
        for(int i = 0; i<ch.length;i++){
            System.out.print(ch[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char ch[] = {'H', 'E', 'L' , 'L', 'O'};
        print(ch);
        reverse(ch);
        print(ch);

        
        
    }
}
