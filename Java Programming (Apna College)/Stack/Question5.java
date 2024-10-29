// Question 5 ----> Next Greater Element To the Right
import java.util.*;

public class Question5 {
    public static void main(String args[]){
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length -1; i >= 0; i-- ){
            // step 1
            while(!s.empty()  && arr[s.peek()] <= arr[i]){
                s.pop();
            }


            //step 2
            if(s.empty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            // step 3
            s.push(i);
        }
        for(int i = 0; i< nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
