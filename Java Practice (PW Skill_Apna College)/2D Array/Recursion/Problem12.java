// Given a number num and a value k. Print k multiples of num.
// such that:- num = 12 , k =5;
// output :- 12 , 24 ,36, 48 , 60;
public class Problem12 {
    public static void print(int num, int k){
        // if(k == 1){
        //     System.out.print(num*k + " ");
        //     return;
        // }
        if(k ==0){ // Method 2 (we can save an extra printing line by making it k == 0.
            return;
        }

         print(num, k-1);
        System.out.print(num*k + " ");
        
    }
    public static void main(String args[]){
        print(3, 8);
    }
}
