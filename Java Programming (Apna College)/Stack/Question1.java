// Question 1 ---> Push At the Bottom of the stack
// Note --> We can do this question by many ways but we are going to use recursion method in linear time complexity o(1)
import java.util.*;
public class Question1 {
    public static void PushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);

    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBottom(s , 4);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
