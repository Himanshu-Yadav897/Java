// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.
// Sample Input : 1947
// Sample Output : “one nine four seven”

public class Second {
    public static void print(int n , String digit[]){
        if(n == 0){
            return;
        }

        int lastdigit = n % 10;
        n = n / 10;
        print(n , digit);
        System.out.print(digit[lastdigit] + " ");
      
    }
    public static void main(String args[]){
        String digit[] = {"zero" , "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        print(1947, digit);
    }
    
}
