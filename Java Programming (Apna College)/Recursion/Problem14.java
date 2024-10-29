//Print all Binary Strings of N Size without Consecutive ones(1);
public class Problem14 {
    public static void print(int n , int lastPlace, String str){
        // Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // kaam
        print(n-1, 0, str + "0");
        if(lastPlace == 0){
            print(n-1, 1, str + "1");
        }
    } 
    public static void main(String args[]){
        print(3, 0, "");
    }
}
