import java.util.Stack;

// Max Area In Histogram
public class Question8 {
    public static void maxarea(int arr[]){ // 0(n)
        int maxArea = 0;
        int nsr[] = new int[arr.length];  // Next Smaller Right
        int nsl[] = new int[arr.length]; // Next smaller Left

        // Next Smaller Right

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length -1 ; i >= 0; i--){
            while(!s.isEmpty()  && arr[s.peek()]  >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }


        // Next Smaller Left

        s = new Stack<>();

        for(int i = 0 ; i < arr.length; i++){
            while(!s.isEmpty()  && arr[s.peek()]  >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        // Current Area :- Width = j-i-1 ----> nsr[j] - nsr[i] -1

        for(int i = 0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea , maxArea);
        }

        System.out.println("max Area in Histogram =" + maxArea);
    }

    public static void main(String args[]){
        int arr[] = { 2,1,5,6,2,3}; // Heights in histogram

        maxarea(arr);
    }
}
