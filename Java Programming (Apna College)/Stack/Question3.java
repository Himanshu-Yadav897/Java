// Question 3 ---> Reverse a stack
// Note ---> We have multiple ways to Solve this problem but we are going to solve this problem
// using recursion and without using any extra space 
// Time Complexity O(n) 
// Space Complexity O(1)
import java.util.*;
public class Question3 {
    public static void PushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        PushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
       while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //printStack(s);
        reverseStack(s);
        printStack(s);
    }
    
}
